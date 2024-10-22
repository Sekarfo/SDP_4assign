package Interpreter;

public class Inter {
    public static Expression parse(String expression) {
        String[] tokens = expression.split(" ");
        Expression result = new Number_Expres(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            Expression nextExpression = new Number_Expres(Integer.parseInt(tokens[i + 1]));
            result = new Operation_Expres(result, nextExpression, operator);
        }

        return result;
    }

    public static void main(String[] args) {
        String expression = "5 + 2 - 3";
        Expression parsedExpression = Inter.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret());
    }
}

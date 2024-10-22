package Interpreter;

public class Operation_Expres implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private char operator;

    public Operation_Expres(Expression leftExpression, Expression rightExpression, char operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int interpret() {
        switch (operator) {
            case '+':
                return leftExpression.interpret() + rightExpression.interpret();
            case '-':
                return leftExpression.interpret() - rightExpression.interpret();
            default:
                throw new UnsupportedOperationException("Invalid operator");
        }
    }
}

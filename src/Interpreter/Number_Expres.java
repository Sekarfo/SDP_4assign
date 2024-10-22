package Interpreter;

public class Number_Expres implements Expression {
    private int number;

    public Number_Expres(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

package calculator;
public class Multiplication extends Operation {
    public Multiplication() {
        super("*");
    }

    @Override
    public double execute(double operand1, double operand2) {
        return operand1 * operand2;
    }
}
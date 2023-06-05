package calculator;
public class Subtraction extends Operation {
    public Subtraction() {
        super("-");
    }

    @Override
    public double execute(double operand1, double operand2) {
        return operand1 - operand2;
    }
}
package calculator;
public class Division extends Operation {
    public Division() {
        super("/");
    }

    @Override
    public double execute(double operand1, double operand2) {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
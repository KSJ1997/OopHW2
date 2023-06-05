package calculator;
public class Addition extends Operation {
    public Addition() {
        super("+");
    }

    @Override
    public double execute(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
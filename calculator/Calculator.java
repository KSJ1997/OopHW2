package calculator;
public class Calculator {
    private Operation[] operations;

    public Calculator() {
        operations = new Operation[4];
        operations[0] = new Addition();
        operations[1] = new Subtraction();
        operations[2] = new Multiplication();
        operations[3] = new Division();
    }

    public double calculate(double operand1, double operand2, String operator) {
        for (Operation operation : operations) {
            if (operation.getSymbol().equals(operator)) {
                return operation.execute(operand1, operand2);
            }
        }
        throw new IllegalArgumentException("Invalid operator");
    }
}
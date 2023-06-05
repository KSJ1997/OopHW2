package calculator;
public abstract class Operation {
    private String symbol;

    public Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract double execute(double operand1, double operand2);
}
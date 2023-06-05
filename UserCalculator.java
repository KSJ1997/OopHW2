import calculator.Calculator;
import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.print("Введите первый Число: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Введите второй Число: ");
        double operand2 = scanner.nextDouble();

        double result = calculator.calculate(operand1, operand2, operator);

        System.out.println("Результат: " + operand1 + " " + operator + " " + operand2 + " = " + result);

        scanner.close();
    }
}
import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: +, -, *, /");
        System.out.println();

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    if (num2 != 0) {
                        System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

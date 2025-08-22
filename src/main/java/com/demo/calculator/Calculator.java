package com.demo.calculator;

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Error: Division by zero!");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Calculator Application *****");

        while (true) {
            try {
                System.out.println("\nChoose operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                if (choice == 5) {
                    System.out.println("Exiting... Bye!");
                    break;
                }

                System.out.print("Enter first number: ");
                double a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double b = scanner.nextDouble();

                double result = switch (choice) {
                    case 1 -> add(a, b);
                    case 2 -> subtract(a, b);
                    case 3 -> multiply(a, b);
                    case 4 -> divide(a, b);
                    default -> {
                        System.out.println("Invalid choice!");
                        yield Double.NaN;
                    }
                };

                if (!Double.isNaN(result)) {
                    System.out.println("Result = " + result);
                }
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Invalid input! Please enter numbers only.");
                scanner.nextLine(); // clear bad token
            }
        }
        scanner.close();
    }
}

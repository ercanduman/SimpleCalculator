package ercanduman.simplecalculator;

import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Type first number: ");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Type second number: ");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Select operation (+ - * /):");
            String operation = scanner.nextLine();

            double result;
            switch (operation) {
                case "+":
                    result = addNumbers(firstNumber, secondNumber);
                    break;
                case "-":
                    result = subtractNumbers(firstNumber, secondNumber);
                    break;
                case "/":
                    result = divideNumbers(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiplyNumbers(firstNumber, secondNumber);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }
            System.out.println("The answer is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static double addNumbers(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    private static double subtractNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double divideNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    private static double multiplyNumbers(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}

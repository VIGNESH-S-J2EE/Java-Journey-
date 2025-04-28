package JavaBasics.Calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create Scanner Class
        Scanner scanner = new Scanner(System.in);

        // Variables
        double num1 , num2 , result = 0;
        char operator;

        // User Inputs
        System.out.print("Enter First Number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+ , - , * , /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter Second Number: ");
        num2 = scanner.nextDouble();


        // Conditions

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result : " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result : " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result : " + result);
        } else if (operator == '/'){
            // Avoid any number divided by zero
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result : " + result);
            } else {
                System.out.println("Cannot Divided By Zero..... ");
            }
        } else {
            System.out.println("Invalid Input....");
        }
        scanner.close();
    }
}

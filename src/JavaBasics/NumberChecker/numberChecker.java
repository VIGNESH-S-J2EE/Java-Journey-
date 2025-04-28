package JavaBasics.NumberChecker;

import java.util.Scanner;

public class numberChecker {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Read Input
        System.out.print("Enter a Number : ");
        number = scan.nextInt();

        // Conditions
        if (number > 0) {
            System.out.println(number + " is a Positive Number.");
        } else if (number < 0) {
            System.out.println(number + " is a Negative Number.");
        } else {
            System.out.println("zero");
        }

        // Close Scan Class
        scan.close();
    }
}

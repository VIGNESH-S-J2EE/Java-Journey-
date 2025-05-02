package JavaBasics.Fundamentals.ChracterTypeChecker;

import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        char input;

        // User Read Input
        System.out.print("Enter a Single Character : ");
        input = scan.next().charAt(0);

        // Conditions
        if (input >= 'a' && input <= 'z') {
            System.out.println(input + " is a Lower Case.");
        } else if (input >= 'A' && input <= 'Z') {
            System.out.println(input + " is an Upper Case.");
        } else if (input >= '0' && input <= '9') {
            System.out.println(input + " is a Digit.");
        } else {
            System.out.println(input + " is a Special Character.");
        }

        // Close Scan Class
        scan.close();
    }
}

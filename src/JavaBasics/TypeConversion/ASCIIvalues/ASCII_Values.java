package JavaBasics.TypeConversion.ASCIIvalues;

import java.util.Scanner;

public class ASCII_Values {
    // Conditions
    public static void printAsciiValues(char letter) {
        System.out.println("Char ASCII Value : ");
        System.out.println((int) letter);

        System.out.println("ASCII Value to char : ");
        System.out.println((char) letter);
    }
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 06:12:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        char character;

        // User Input
        System.out.print("Enter a Character : ");
        character = scan.next().charAt(0);

        // Calling a printAsciiValues Method
        printAsciiValues(character);


        // Close Scanner Class
        scan.close();

    }
}

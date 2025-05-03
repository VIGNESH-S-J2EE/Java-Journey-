package JavaBasics.LoopsAndMethods.MultiplicationGenerator;

import java.util.Scanner;

public class Multiplication {
    public static void printTable(int num , int bottom) {
        // Variables
        int result;

        // Conditions
        for (int i = 1; i <= bottom; i++) {
            result = num * i;
            System.out.println(num + " x " +  i + " = " + result);
        }
    }
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 7:40:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number , bottomNumber;

        // User Input
        System.out.print("Enter a Table Number : ");
        number = scan.nextInt();

        System.out.print("Enter a bottomNumber : ");
        bottomNumber = scan.nextInt();

        // Calling printTable Method
        printTable(number , bottomNumber);

        // Close Scanner Class
        scan.close();

    }
}

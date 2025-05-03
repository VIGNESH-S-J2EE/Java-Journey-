package JavaBasics.TypeConversion.FloatingPointAdjuster;

import java.util.Scanner;

public class floatPoint {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 04:38:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double num ,multiplier, adjusted;
        int precision;

        // User Input
        System.out.print("Enter a Floating Point Number: ");
        num = scan.nextDouble();

        System.out.print("Enter the Precision (number of decimal place) : ");
        precision = scan.nextInt();

        // Conditions
        multiplier = Math.pow(10, precision);

        adjusted = Math.floor(num * multiplier + 0.5) / multiplier;

        System.out.println("Rounded number : " + adjusted);

        // Close Scanner Class
        scan.close();
    }
}

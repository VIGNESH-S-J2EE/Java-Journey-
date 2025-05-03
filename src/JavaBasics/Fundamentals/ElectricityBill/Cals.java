package JavaBasics.Fundamentals.ElectricityBill;

import java.util.Scanner;

public class Cals {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 13, 2024
         * Time: 10:20:00 AM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double bill = 0;
        int units;

        // User Read Input
        System.out.print("Enter the number of units consumed : ");
        units = scan.nextInt();

        // Conditions

        if (units <= 0) {
            System.out.println("Invalid Input. Units must be positive.");
        } else if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 4.0 + (units - 300) * 5.0;
        }

        if (units > 0) {
            //printf => formatted printing statement
            System.out.printf("Total Electricity Bill : ₹%.2f%n", bill);
        }

        // Close Scan Class
        scan.close();
    }
}

package JavaBasics.Fundamentals.BloodDonation;

import java.util.Scanner;

public class Eligibility {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 12, 2024
         * Time: 06:35:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // hemoglobin ≥12.5 (for women) or ≥13.5 (for men)

        // Variables
        int age;
        double weight , hemoglobin;

        //User Read Input
        System.out.print("Enter age : ");
        age = scan.nextInt();

        System.out.print("Enter weight (in Kg) : ");
        weight = scan.nextDouble();

        System.out.print("Enter hemoglobin : ");
        hemoglobin = scan.nextDouble();

        //Conditions

        if (age >= 18 && weight >= 50 && hemoglobin >= 12.5) {
            System.out.println("Eligible to Donate.");
        } else {
            System.out.println("Not Eligible to Donate.");
        }

        // Close Scan Class
        scan.close();
    }
}

package JavaBasics.TypeConversion.UnitConverter;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 5:40:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int choice , meters;
        double Kilograms , grams , Km , Kg;

        // User Input
        System.out.println("Choose Conversion.");
        System.out.println("1. Meters to KiloMeters");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Kilograms to Grams");
        System.out.println("4. Grams to Kilograms");

        System.out.print("Enter Your Choice : ");
        choice = scan.nextInt();

        // Conditions
        if (choice == 1) {
            System.out.print("Enter Meters : ");
            meters = scan.nextInt();
            Km = meters / 1000.0;
            System.out.println("Result : "+ Km + " Km");
        } else if (choice == 2) {
            System.out.print("Enter Kilometers : ");
            Km = scan.nextDouble();
            meters = (int) (Km * 1000);
            System.out.println("Result : "+ meters + " meters");
        } else if (choice == 3) {
            System.out.print("Enter Kilograms : ");
            Kilograms = scan.nextDouble();
            grams = (int) Kilograms * 1000;
            System.out.println("Result : "+ grams + " grams");
        } else if (choice == 4) {
            System.out.print("Enter Grams : ");
            grams = scan.nextDouble();
            Kg = grams / 1000.0;
            System.out.println("Result : " + Kg + " Kg");
        } else {
            System.out.println("Invalid Choice.");
        }

        // Close Scanner Class
        scan.close();
    }
}

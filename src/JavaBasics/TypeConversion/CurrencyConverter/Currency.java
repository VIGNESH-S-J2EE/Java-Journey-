package JavaBasics.TypeConversion.CurrencyConverter;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 5:40:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);


        // Variables
        int choice;
        double usdValue, eurValue, inr , usd , eur;

        // User Input
        System.out.println("Choose Conversions.");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.print("Enter your Choice (1 to 4) : ");
        choice = scan.nextInt();

        // Constants
        usdValue = 83.0;
        eurValue = 90.0;

        // Conditions
        if (choice == 1) {
            System.out.print("Enter INR amount : ");
            inr = scan.nextDouble();
            usd = inr / usdValue;
            System.out.println("Converted : " + usd + " USD");
        } else if (choice == 2) {
            System.out.print("Enter USD amount : ");
            usd = scan.nextDouble();
            inr = usd * usdValue;
            System.out.println("Converted : " + inr + " INR");
        } else if (choice == 3) {
            System.out.println("Enter INR amount : ");
            inr = scan.nextDouble();
            eur = inr / eurValue;
            System.out.println("Converted : " + eur + " EUR");
        } else if (choice == 4) {
            System.out.println("Enter EUR amount : ");
            eur = scan.nextDouble();
            inr = eur * eurValue;
            System.out.println("Converted : " + inr + " INR");
        }

        // Close Scanner Class
        scan.close();
    }
}

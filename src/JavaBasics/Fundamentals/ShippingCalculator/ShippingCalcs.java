package JavaBasics.Fundamentals.ShippingCalculator;

import java.util.Scanner;

public class ShippingCalcs {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double weight , cost;

        // User Read Input
        System.out.print("\nEnter the weight of your package (in Kg) : ");
        weight = scan.nextDouble();

        // Conditions
        if (weight <= 0) {
            System.out.println("Invalid weight.");
        } else if (weight <= 1) {
            cost = 5;
            System.out.println("Shipping Cost is ₹" + cost);
        } else if (weight <= 5) {
            cost = 10;
            System.out.println("Shipping Cost is ₹" + cost);
        } else if (weight > 5) {
            cost = 20;
            System.out.println("Shipping Cost is ₹" + cost);
        }

        // Close Scan Class
        scan.close();
    }
}

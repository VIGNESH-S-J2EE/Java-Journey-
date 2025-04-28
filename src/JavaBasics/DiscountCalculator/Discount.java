package JavaBasics.DiscountCalculator;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double originalPrice , discountPercentage , discountAmount , finalPrice;

        // User Input
        System.out.print("\nEnter original price (in ₹) : ");
        originalPrice = scan.nextDouble();

        System.out.print("\nEnter Discount Percentage (in %) : ");
        discountPercentage = scan.nextDouble();

        // Conditions
        if (discountPercentage >= 0 && discountPercentage <= 100) {
            discountAmount = (originalPrice * discountPercentage) / 100;
            finalPrice = originalPrice - discountAmount;

            System.out.println("\nDiscount Amount : ₹" + discountAmount);
            System.out.println("Final Price after Discount : ₹" + finalPrice);
        } else  {
            System.out.println("Invalid discount percentage entered! It must be between 0 - 100.");
        }

        // Close Scan Class
        scan.close();
    }
}

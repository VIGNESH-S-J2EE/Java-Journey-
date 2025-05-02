package JavaBasics.Fundamentals.ProfitOrLoss;

import java.util.Scanner;

public class ProfitOrLossChecker {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double costPrice , sellingPrice , profit, loss;

        // User Read Input
        System.out.print("Enter Cost Price: ");
        costPrice = scan.nextDouble();

        System.out.print("Enter Selling Price: ");
        sellingPrice = scan.nextDouble();

        //Conditions
        if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            System.out.println("Profit : ₹" + profit);
        } else if (costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            System.out.println("Loss : ₹" + loss);
        } else {
            System.out.println("No Profit or Loss.");
        }

        // Close Scan Class
        scan.close();
    }
}

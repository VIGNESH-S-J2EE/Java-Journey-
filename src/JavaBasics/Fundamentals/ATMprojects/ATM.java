package JavaBasics.Fundamentals.ATMprojects;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        /*

        */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double balance = 1000.0; // initial balance
        int choice;
        double amount;

        // menu option
        System.out.println("Welcome to Mini ATM Project");
        System.out.println(" 1.  Check Balance");
        System.out.println(" 2.  Deposit Money");
        System.out.println(" 3.  Withdraw Money");
        System.out.print(" Enter Your Choice (1/2/3) : ");
        choice = scan.nextInt();

        // conditions
        if (choice == 1) {
            System.out.println("Your Current Balance is : ₹" + balance);
        } else if (choice == 2) {
            System.out.print("Enter Amount to Deposit : ₹");
            amount = scan.nextDouble();

            if (amount > 0) {
                balance += amount;
                System.out.print("Amount Deposited Successfully!...");
                System.out.println("Updated Balance : ₹" + balance);
            } else {
                System.out.println("Invaild Deposit Amount!...");
            }

        } else if (choice == 3) {
            System.out.print("Enter Amount to Withdraw : ₹");
            amount = scan.nextDouble();

            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw Successfully!...");
                System.out.println("Updated Balance: ₹" + balance);
            } else {
                System.out.println("Invalid Withdrawal amount or Insufficient balance!");
            }
        } else {
            System.out.println("Invalid Choice! Please try again.");
        }
        // Close Scan Class
        scan.close();
    }
}

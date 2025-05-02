package JavaBasics.Fundamentals.SimpleInterest;

import java.util.Scanner;

public class SIcalcs {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double principal, rate, time, simpleInterset;

        // User Inputs
        System.out.print("Enter Principal Amount (in ₹) : ");
        principal = scan.nextDouble();

        System.out.print("Enter Rate of Interest (in %) : ");
        rate = scan.nextDouble();

        System.out.print("Enter Time Period (in years) : ");
        time = scan.nextDouble();

        // Calculations
        simpleInterset = (principal * rate * time) / 100;

        System.out.println("\nSimple Interest = ₹" + simpleInterset);

        // Close
        scan.close();
    }
}

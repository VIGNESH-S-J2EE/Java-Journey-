package JavaBasics.BMIcalculator;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double weight , height , BMI;

        // User Input
        System.out.print("Enter Weight (in Kg) : ");
        weight = scan.nextDouble();

        System.out.print("Enter Height (in m) : ");
        height = scan.nextDouble();

        // Calculation
        BMI = weight / (height * height);

        // Conditions
        if (BMI < 18.5) {
            System.out.println("Your BMI is "+ BMI +" (Underweight)");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Your BMI is "+ BMI +" (Normal)");
        } else if (BMI >= 25 && BMI < 29.9) {
            System.out.println("Your BMI is "+ BMI +" (Overweight)");
        } else {
            System.out.println("You are Obese.");
        }

        // Close Scan Class
        scan.close();
    }
}

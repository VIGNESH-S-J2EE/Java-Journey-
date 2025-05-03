package JavaBasics.Fundamentals.LargestThree;

import java.util.Scanner;

public class largestOfThreeNo {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 13, 2024
         * Time: 06:41:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int num1 , num2 , num3;

        // User Input
        System.out.print("Enter num1 : ");
        num1 = scan.nextInt();

        System.out.print("Enter num2 : ");
        num2 = scan.nextInt();

        System.out.print("Enter num3 : ");
        num3 = scan.nextInt();

        // Conditions

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the Largest Number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the Largest Number.");
        } else {
            System.out.println(num3 + " is the Largest Number.");
        }

        // Close Scan Class
        scan.close();

    }
}

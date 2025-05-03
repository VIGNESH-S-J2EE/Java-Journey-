package JavaBasics.Fundamentals.OddOrEven;

import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 13, 2024
         * Time: 10:30:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Inputs
        System.out.print("Enter a Number : ");
        number = scan.nextInt();

        // Conditional Statement
        if (number % 2 == 0) {
            System.out.println(number +" is a Even Number");
        } else {
            System.out.println(number +" is a Odd Number");
        }
        //Close
        scan.close();
    }
}

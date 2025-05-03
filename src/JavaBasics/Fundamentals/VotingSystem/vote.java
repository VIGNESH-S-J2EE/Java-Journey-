package JavaBasics.Fundamentals.VotingSystem;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 14, 2024
         * Time: 06:00:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        //Variables
        int age;

        //User Input
        System.out.print("Enter your Age : ");
        age = scan.nextInt();

        //Conditions
        if (age >= 18) {
            System.out.println("You can Vote....");
        } else {
            System.out.println("Your cannot Vote....");
        }

        // Close
        scan.close();
    }
}

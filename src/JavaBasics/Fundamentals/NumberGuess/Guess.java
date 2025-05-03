package JavaBasics.Fundamentals.NumberGuess;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 13, 2024
         * Time: 09:50:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int secretNumber , userNumber;

        // Using Randomize
        secretNumber = (int) (Math.random() * 10) + 1;

        // User Read Input
        System.out.print("Guess a number between 1 to 10 : ");
        userNumber = scan.nextInt();

        // Conditions
        if (userNumber == secretNumber) {
            System.out.println("Correct! You guessed the number.");
        } else if (userNumber > secretNumber) {
            System.out.println("Too high! The number was  " + secretNumber );
        } else {
            System.out.println("Too low! The number was  " + secretNumber );
        }

        // Close Scan Class
        scan.close();
    }
}

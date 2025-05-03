package JavaBasics.LoopsAndMethods.PrimeNumber;

import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 10:00:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter a Number : ");
        number = scan.nextInt();

        // Calling isPrime Method
        System.out.println(isPrime(number));
    }
}

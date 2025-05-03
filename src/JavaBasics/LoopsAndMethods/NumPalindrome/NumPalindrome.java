package JavaBasics.LoopsAndMethods.NumPalindrome;

import java.util.Scanner;

public class NumPalindrome {

    public static boolean isPalindrome (int num) {
        int original = num , reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 7:05:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling isArmstrong
        System.out.println(isPalindrome(number));

        // Close Scan Class
        scan.close();
    }
}

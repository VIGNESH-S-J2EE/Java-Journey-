package JavaBasics.LoopsAndMethods.DigitSum;

import java.util.Scanner;

public class DigitSum {

    public static int printSumDigits (int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 5:49:00 AM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling printSumDigits
        System.out.println(printSumDigits(number));

        // Close Scan Class
        scan.close();

    }
}

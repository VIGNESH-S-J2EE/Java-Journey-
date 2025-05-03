package JavaBasics.LoopsAndMethods.CountDigit;

import java.util.Scanner;

public class CountDigits {

    public static int countDigits (int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 8:15:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling isArmstrong
        System.out.println(countDigits(number));

        // Close Scan Class
        scan.close();
    }
}

package JavaBasics.LoopsAndMethods.NumberReverser;

import java.util.Scanner;

public class number_Reverser {

    public static int numReverse (int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 6:20:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        //Calling numReverse Method
        System.out.println(numReverse(number));

        // Close Scan Class
        scan.close();
    }
}

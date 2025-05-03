package JavaBasics.LoopsAndMethods.ArmstrongNumber;

import java.util.Scanner;

public class Armstrong {

    public static boolean isArmstrong (int num) {
        int temp = num , sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 5:50:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling isArmstrong
        System.out.println(isArmstrong(number));

        // Close Scan Class
        scan.close();
    }
}

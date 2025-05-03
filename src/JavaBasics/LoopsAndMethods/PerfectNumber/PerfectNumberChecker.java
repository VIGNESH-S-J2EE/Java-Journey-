package JavaBasics.LoopsAndMethods.PerfectNumber;

import java.util.Scanner;

public class PerfectNumberChecker {

    public static boolean PerfectNum (int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 5:22:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling PerfectNumber
        System.out.println(PerfectNum(number));

        // Close Scan Class
        scan.close();
    }
}

package JavaBasics.LoopsAndMethods.FactorialCalcs;

import java.util.Scanner;

public class FactorialCalculator {
    public static long printFactorial (int num) {
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 8:31:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter a number : ");
        number = scan.nextInt();

        // Calling printFactorial Method
        System.out.println(printFactorial(number));

        // Close Scan Class
        scan.close();

    }
}

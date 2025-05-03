package JavaBasics.LoopsAndMethods.FibonacciSeries;

import java.util.Scanner;

public class Fibonacci {

    public static void generateFibonacci (int num) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 3; i <= num; i++) {
            int next = num1 + num2;
            System.out.print(next + " ");
            num1 = num2;
            num2 = next;
        }
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 4:30:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling generateFibonacci
      generateFibonacci(number);

        // Close Scan Class
        scan.close();
    }
}

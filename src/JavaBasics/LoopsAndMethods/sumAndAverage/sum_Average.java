package JavaBasics.LoopsAndMethods.sumAndAverage;

import java.util.Scanner;

public class sum_Average {

    public static double printSumAndAverage (int[] arr) {
        // Variables
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 9:25:00 PM
         */

        // In these method are not efficient if you want efficient remove the method of printSumAndAverage.


        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // User Input
        System.out.print("How Many Numbers ? : ");
        int count = scan.nextInt();
        // Array
        int[] nums = new int[count];

        int sum = 0;
        // Conditions
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = scan.nextInt();
            sum += nums[i];
        }

        System.out.println("Sum : " + sum);
        System.out.println(printSumAndAverage(nums)); // Calling printSumAndAverage Method

        // Close Scan Class
        scan.close();
    }
}

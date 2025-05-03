package JavaBasics.LoopsAndMethods.Lcm;

import java.util.Scanner;

public class LCM_Finder {

    public static int LCM (int num1 , int num2) {
        int max = Math.max(num1 , num2);

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                return max;
            }
            max++;
        }
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 6:33:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number1 , number2;

        // User Input
        System.out.print("Enter Number1 : ");
        number1 = scan.nextInt();

        System.out.print("Enter Number2 : ");
        number2 = scan.nextInt();

        // Calling LCM
        System.out.println(LCM(number1 , number2));

        // Close Scan Class
        scan.close();
    }
}

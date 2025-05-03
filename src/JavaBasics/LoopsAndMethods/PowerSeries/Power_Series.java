package JavaBasics.LoopsAndMethods.PowerSeries;

import java.util.Scanner;

public class Power_Series {

    public static int squareSum (int n) {
        int sum = 0;
        for (int i = 1;i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 18, 2024
         * Time: 8:43:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int number;

        // User Input
        System.out.print("Enter Number : ");
        number = scan.nextInt();

        // Calling isArmstrong
        System.out.println(squareSum(number));

        // Close Scan Class
        scan.close();
    }
}


/*
*
* git init
git add README.md
git commit -m "first commit"
git branch -M main
* git remote add origin https://github.com/VIGNESH-S-J2EE/Animation-Loading.git
git push -u origin main
* */
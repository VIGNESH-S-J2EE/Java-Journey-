package JavaBasics.TypeConversion.AgeInSeconds;

import java.util.Scanner;

public class AgeSeconds {
    public static void printData(int totalDays , int hours , int minutes , long seconds) {
        System.out.println(totalDays + " days (including leap years)");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
    }
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 08:19:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int age , totalDays , hours , minutes , leapDays;
        long seconds;

        // User Input
        System.out.print("Enter your age in years : ");
        age = scan.nextInt();

        // Calculate
        leapDays = age / 4;
        totalDays = (age * 365) + leapDays;
        hours = totalDays * 24;
        minutes = hours * 60;
        seconds = (long) minutes * 60;

        // Calling printData Methods
        printData(totalDays , hours , minutes , seconds);

        //Close Scanner Class
        scan.close();
    }
}

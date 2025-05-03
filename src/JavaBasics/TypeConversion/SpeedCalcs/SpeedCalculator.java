package JavaBasics.TypeConversion.SpeedCalcs;

import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 17, 2024
         * Time: 6:40:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int distance, time;
        double speed_mps , speed_kmph;

        // User Input
        System.out.print("Enter Distance (in meters) : ");
        distance = scan.nextInt();

        System.out.print("\nEnter time (in seconds) : ");
        time = scan.nextInt();

        // Conditions
        if (time == 0) {
            System.out.println("Time cannot be zero.");
            return;
        }

        speed_mps = (double) distance / time;
        speed_kmph = ((distance * 18.0) / 5.0 ) / time;

        // output

        System.out.println("Speed: " + speed_mps + " m/s");
        System.out.println("Speed: " + speed_kmph + " km/h");

        // Close Scan Class
        scan.close();
    }
}

package JavaBasics.TypeConversion.Astronomical;

import java.util.Scanner;

public class Astronomical_Unit {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 06:32:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double AstronomicalUnit , KM_PER_AU, MILES_PER_KM, LIGHT_SECONDS_PER_AU;
        double Km , Miles , LightSeconds;

        // User Input
        System.out.print("Enter Distance in Astronomical_Unit (AU) : ");
        AstronomicalUnit = scan.nextDouble();

        // Constants
        KM_PER_AU = 149597870.7;
        MILES_PER_KM = 0.621371;
        LIGHT_SECONDS_PER_AU = 499.004;


        // Calculations
        Km = AstronomicalUnit * KM_PER_AU;
        Miles = Km * MILES_PER_KM;
        LightSeconds = AstronomicalUnit * LIGHT_SECONDS_PER_AU;

        // Output
        System.out.println("Kilometers : " + (int)(Km * 100) / 100.0);
        System.out.println("Miles : " + (int) (Miles * 100) / 100.0);
        System.out.println("Light Seconds : " + (int) (LightSeconds * 100) / 100.0);
        //Close Scanner Class
        scan.close();
    }
}

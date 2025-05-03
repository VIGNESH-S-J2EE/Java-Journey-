package JavaBasics.TypeConversion.TempConverter;

import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 16, 2024
         * Time: 10:00:00 PM
         */

        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int choice;
        double result , celsius, fahrenheit;

        // User Input
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose your Choice (1 or 2) : ");
        choice = scan.nextInt();

        //Conditions
        switch (choice) {
            case 1:
                System.out.print("Enter Temperature in Celsius : ");
                celsius = scan.nextDouble();
                result = (celsius * 9 / 5) + 32;
                System.out.println("Fahrenheit : " + ((int) (result * 100)) / 100.0);
                break;

            case 2:
                System.out.print("Enter Temperature in Fahrenheit : ");
                fahrenheit = scan.nextDouble();
                result = (fahrenheit - 32) * 5 / 9;
                System.out.println("Celsius : " + ((int) (result * 100)) / 100.0);
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        //Close Scanner Class
        scan.close();
    }
}

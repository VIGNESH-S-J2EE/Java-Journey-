package JavaBasics.Fundamentals.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int year;

        // User Input
        System.out.print("\nEnter a year : ");
        year = scan.nextInt();

        // Conditions
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.print(year + " is Not a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        // Close Scan Class
        scan.close();
    }
}

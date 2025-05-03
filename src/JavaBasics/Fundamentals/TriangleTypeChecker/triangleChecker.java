package JavaBasics.Fundamentals.TriangleTypeChecker;

import java.util.Scanner;

public class triangleChecker {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 14, 2024
         * Time: 05:00:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double angle1 , angle2 , angle3;

        //User Read Inputs
        System.out.print("Enter angle 1: ");
        angle1 = scan.nextDouble();

        System.out.print("Enter angle 2: ");
        angle2 = scan.nextDouble();

        System.out.print("Enter angle 3: ");
        angle3 = scan.nextDouble();

        // Conditions
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {

            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("Equilateral triangle.");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles triangle.");
            } else {
                System.out.println("Scalene triangle.");
            }
        } else {
            System.out.println("Invalid Triangle Angle Must be add up to 180 and positive.");
        }
        // Close Scan Class
        scan.close();
    }
}

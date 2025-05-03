package JavaBasics.Fundamentals.Qudratic;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        /*
         * Author: S.Vignesh
         * Created: November 13, 2024
         * Time: 11:30:00 PM
         */
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        /*
                Quadratic Formula
                   ax² + bx + c = 0
                    D = b² - 4ac
         */

        // Variables
        double a , b , c , D , root1 ,root2 , root;

        // User Read Input
        System.out.print("Enter Coefficient of a : ");
        a = scan.nextDouble();

        System.out.print("Enter Coefficient of b : ");
        b = scan.nextDouble();

        System.out.print("Enter Coefficient of c : ");
        c = scan.nextDouble();

        // Calculations
        D = b * b - 4 * a * c;

        // Conditions
        if (D > 0) {
            root1 = (-b + Math.sqrt(D)) / (2 * a);
            root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots : " + root1 + " and " + root2);
        } else if (D == 0) {
            root = -b / (2 * a);
            System.out.println("One real root (equal roots): " + root);
        } else {
            System.out.println("No real roots.");
        }

        // Close Scan Class
        scan.close();
    }
}

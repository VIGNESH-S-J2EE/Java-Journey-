package JavaBasics.Fundamentals.RectangleCalcs;

import java.util.Scanner;

public class RectProperitiesChecker {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        double length , width , area, perimeter;

        //User Read Input
        System.out.print("Enter length :  ");
        length = scan.nextDouble();

        System.out.print("Enter Width :  ");
        width = scan.nextDouble();

        // Conditions

        if (length <= 0 || width <= 0) {
            System.out.println("Length and width must be positive numbers.");
        } else {
            area = length * width;
            perimeter = 2 * (length + width);

            System.out.printf("Area: %.2f square units\n", area);
            System.out.printf("Perimeter: %.2f units\n", perimeter);
        }

        if (length == width) {
            System.out.println("It's a square!");
        } else {
            System.out.println("It's a rectangle");
        }

        //Close Scan Class
        scan.close();
    }
}

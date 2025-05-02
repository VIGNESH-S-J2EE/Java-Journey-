package JavaBasics.Fundamentals.DayOfWeek;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int Days;

        // User Read Input
        System.out.print("Enter a Day : ");
        Days = scan.nextInt();

        // Conditions
        switch (Days) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid Day it must give (1 - 7)");
        }
        // Close Scan Class
        scan.close();
    }
}

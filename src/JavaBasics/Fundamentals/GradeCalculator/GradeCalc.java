package JavaBasics.Fundamentals.GradeCalculator;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        int mark1 , mark2 , mark3 , mark4 , mark5;
        int totalMarks = 0;
        double average = 0;
        char Grade;

        // User Inputs
        System.out.print("Enter marks for Subject 1: ");
        mark1 = scan.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = scan.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = scan.nextInt();

        System.out.print("Enter marks for Subject 4: ");
        mark4 = scan.nextInt();

        System.out.print("Enter marks for Subject 5: ");
        mark5 = scan.nextInt();

        // Calculations
        totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        average = totalMarks / 5.0;

        // Conditional Statements
        if (average >= 90 && average <= 100) {
            Grade = 'A';
        } else if (average >= 80) {
            Grade = 'B';
        } else if (average >= 70) {
            Grade = 'C';
        } else if (average >= 60) {
            Grade = 'D';
        } else {
            Grade = 'F';
        }

        // Output
        System.out.println("\nTotal Marks : " + totalMarks);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + Grade);

        //close
        scan.close();
    }
}

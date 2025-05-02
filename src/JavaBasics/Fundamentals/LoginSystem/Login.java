package JavaBasics.Fundamentals.LoginSystem;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Predefined Correct userName and Password
        String correctUserName = "Vignesh";
        String correctPassword = "java@vignesh";

        // Variables
        String userName , password;

        // User Input
        System.out.print("Enter Username : ");
        userName = scan.nextLine();


        System.out.print("Enter Password : ");
        password = scan.nextLine();

        // Conditions
        if (userName.equals(correctUserName) && password.equals(correctPassword)) {
            System.out.println("\nLogin Successful! Welcome " + userName + "!");
        } else {
            System.out.println("\nLogin Failed! Incorrect userName or Password.");
        }

        // Close Scan Class
        scan.close();
    }
}

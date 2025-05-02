package JavaBasics.Fundamentals.RockPaperScissor;

import java.util.Scanner;

public class RockProject {
    public static void main(String[] args) {
        // Scanner Class
        Scanner scan = new Scanner(System.in);

        // Variables
        char user;

        //User Input
        System.out.println("R -> ROCK");
        System.out.println("P -> PAPER");
        System.out.println("S -> SCISSOR");
        System.out.print("Enter your choice (R / P / S) : ");
        user = scan.next().charAt(0);

        // Computer Choice for Randomized
        char[] choice = {'R' , 'P' , 'S'};
        int randomIndex = (int)(Math.random() * 3);
        char computer = choice[randomIndex];

        System.out.println("Computer Choice : " + computer);

        //Conditions
        switch (user) {
            case'R':
                switch (computer) {
                    case 'R':
                        System.out.println("It's a Tie.");
                        break;
                    case 'P':
                        System.out.println("You Win.");
                        break;
                    case 'S':
                        System.out.println("You Lose.");
                        break;
                }
                break;

            case 'P':
                switch (computer) {
                    case 'R':
                        System.out.println("You Win.");
                        break;
                    case 'P':
                        System.out.println("It's a Tie.");
                        break;
                    case 'S':
                        System.out.println("You Lose.");
                        break;
                }
                break;

            case 'S':
                switch (computer) {
                    case 'R':
                        System.out.println("You Lose.");
                        break;
                    case 'P':
                        System.out.println("You Win.");
                        break;
                    case 'S':
                        System.out.println("It's a Tie.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid input! Use r, p, or s only.");
        }

        // Close Scan Class
        scan.close();

    }
}

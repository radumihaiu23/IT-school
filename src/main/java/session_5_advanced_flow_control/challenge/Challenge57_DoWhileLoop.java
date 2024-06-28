package session_5_advanced_flow_control.challenge;

/*Create a program where the user is prompted to guess a predefined number. After each guess, the program should inform
 the user if the guess is too high or too low. The program should keep prompting the user until they guess correctly.
 Using a do-while loop, ensure the user is always asked at least once.
 */


import java.util.Scanner;

public class Challenge57_DoWhileLoop {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'm thinking of a number. Which one is it?");

        int secretNumber = 13;
        int userInput;

        do {
            userInput = sc.nextInt();
            System.out.println("Last user input: " + userInput);
            if (userInput > secretNumber) {
                System.out.println("Please enter a smaller number");
            } else if (userInput < secretNumber) {
                System.out.println("Please enter a bigger number");
            }

        } while (userInput != secretNumber);
        System.out.println("You have guessed the number!");
        //no additional check is necessary because the println will be executed only when the "do while" loop becomes false
    }
}

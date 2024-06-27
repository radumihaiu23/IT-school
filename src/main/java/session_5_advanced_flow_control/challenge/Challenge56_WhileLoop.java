package session_5_advanced_flow_control.challenge;

/*6. While Loop
Write a program that asks the user to enter numbers. The program should continue prompting the user until they enter -1.
 After they enter -1, print the sum of all numbers entered (excluding -1). */


import java.util.ArrayList;
import java.util.Scanner;

public class Challenge56_WhileLoop {
    public static void main(String[] args) {
        insistentTerminal();
    }

    public static void insistentTerminal() {
        //initialize an empty ArrayList
        ArrayList<Integer> userHistory = new ArrayList<>();

        //initialize Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter a number asap: ");

        int userInput = 0;
        int sum= 0;
//        do {
//            if (userInput > 0) {
//                System.out.println("Please enter a more negative number: ");
//            } else if (userInput < -1) {
//                System.out.println("Please enter a less negative number: ");
//            }
//            userInput = sc.nextInt();
//            userHistory.add(userInput);
//            System.out.println(">> User history: " + userHistory);
//            sum = sum + userHistory.getLast() ;
//
//        } while (userInput != -1);
//        System.out.println("The sum of all user entered numbers is: " + sum);
        while (userInput != -1) {
            if (userInput > 0) {
                System.out.println("Please enter a more negative number: ");
            } else if (userInput < -1) {
                System.out.println("Please enter a less negative number: ");
            }
            userInput = sc.nextInt();
            userHistory.add(userInput);
            System.out.println(">> User history: " + userHistory);
            sum = sum + userHistory.getLast() ;
        }
        System.out.println("The sum of all user entered numbers is: " + sum); // >>> !!! sum includes -1 value --- to be checked




    }
}

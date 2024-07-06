package session_5_advanced_flow_control.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/*12. Continue Statement
Create a program that asks the user for 10 numbers.
Print the sum of all numbers that are greater than 5.
If the user enters a number less than or equal to 5,
use the continue statement to skip the addition for that number. */

public class Challenge512_ContinueStatements {
    static int userInput;
    static int sum = 0;
    static ArrayList<Integer> numberList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(">> Please enter 10 numbers: ");
        int count = 10;
        while (count > 0) {
            readUserInput();
            if (userInput <= 5) {
                continue;
            }
            numberList.add(userInput);
            count--;
        }
        sum();
        System.out.println("The following numbers were introduced: " + numberList);
        System.out.println("Sum of elements greater than 5 is: " + sum);
    }

    public static void readUserInput() {
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }

    public static void sum() {
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
    }
}

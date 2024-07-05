package session_5_advanced_flow_control.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/*11. Break Statement
Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.
 */


public class Challenge511_BreakStatements {
    static int userNumber;
    static ArrayList<Integer> list = new ArrayList<>();
    static double average;
    static int sum = 0;

    public static void main(String[] args) {
        programLogic();
    }

    public static void programLogic() {
        do {
            requestUserNumber();
            if (userNumber == 0) {
                break;
            }
            addNumberToList(userNumber);
        } while (userNumber != 0);
        calculateAverage(list);
        System.out.println("Average is: " + average);
    }

    public static void requestUserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce numbers: ");
        userNumber = sc.nextInt();
    }

    public static void addNumberToList(int number) {
        list.add(number);
        System.out.println(list);
    }

    public static void calculateAverage(ArrayList listArgument) {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = (double) sum / list.size();
    }
}

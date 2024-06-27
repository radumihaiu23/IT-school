package session_5_advanced_flow_control.challenge;
import java.util.Scanner;

/*5. Fibonacci Series Generator
Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user. */

public class Challenge55_FibonacciSeriesGenerator {
    public static void main(String[] args) {
        fibonacciGenerator();
    }

    public static void fibonacciGenerator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a positive value for the Fibonacci series number: ");
        int userInput = sc.nextInt();
        System.out.println("The first " + userInput + " elements of Fibonacci series will be calculated: ");

        int firstFibElement = 0;
        int secondFibElement = 1;

        for (int index = 0; index < userInput; index++) {
            if (firstFibElement == 0 && secondFibElement == 1) {
                System.out.println(firstFibElement + "\n" + secondFibElement);
            }
            int fibElement = firstFibElement + secondFibElement;
            firstFibElement = secondFibElement;
            secondFibElement = fibElement;
            System.out.println(fibElement);
        }
    }
}






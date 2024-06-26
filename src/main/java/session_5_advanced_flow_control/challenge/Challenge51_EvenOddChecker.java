package session_5_advanced_flow_control.challenge;
import java.util.Scanner;

//1. Even or Odd Checker
//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

public class Challenge51_EvenOddChecker {
    public static void main(String[] args) {
        OddOrEvenChecker();                                                         //1. Call method
    }

    static void OddOrEvenChecker() {
        Scanner scanner = new Scanner(System.in);                                   //2. Create a Scanner object
        System.out.println(" >>>> Please enter an integer asap: ");
        String userInput = scanner.nextLine();                                      //3. Read user input
        System.out.println("The following integer will be checked: " + userInput);  //4. Output user input

        int userIntegerInput = Integer.parseInt(userInput);                         //5. Convert user input from string to int

        if (userIntegerInput % 2 == 0) {                                            //6. Check if the stored int variable is even or odd
            System.out.println("The number: " + userIntegerInput + " is even");
        } else {
            System.out.println("The number: " + userIntegerInput + " is odd");
        }
    }
}

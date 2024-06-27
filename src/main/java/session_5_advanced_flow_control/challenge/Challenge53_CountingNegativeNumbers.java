package session_5_advanced_flow_control.challenge;
import java.util.Arrays;
import java.util.Scanner;

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.

public class Challenge53_CountingNegativeNumbers {
    public static void main(String[] args) {
        readUserInput();
    }

    //1. read an array of integers from user using do while loop
    public static void readUserInput() {
        int userArraySize;
        do {
            Scanner arraySizeScan = new Scanner(System.in);                      //read user input as int
            System.out.println("\n Please enter the size of the array (positive number): ");
            int arraySize = arraySizeScan.nextInt();
            userArraySize = arraySize;

        } while (userArraySize <= 0);

        int[] userArray = new int[userArraySize];                               //initialize empty array of known size
        System.out.println("An array with " + userArray.length + " elements has been created: " + Arrays.toString(userArray) );

        Scanner arrayElementScan = new Scanner(System.in);                      // insert user input in each array slot
        System.out.println("Now, please enter " + userArray.length + " elements: ");
        int userInputElements = 0;
        int negativeInputElement = 0;
        for (int i = 0; i < userArray.length; i++) {
            userInputElements = arrayElementScan.nextInt();
            userArray[i] = userInputElements;
            System.out.println("The array currently contains: " + Arrays.toString(userArray));
            if (userArray[i] < 0){
                negativeInputElement = negativeInputElement + 1;
            }
        }
        System.out.println("\nUser has introduced: " + negativeInputElement + " negative elements in the array");
    }
}

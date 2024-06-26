package session_5_advanced_flow_control.challenge;

//3. Counting Negative Numbers
//Given an array of integers, write a program to count and print the number of negative integers in the array.


import java.util.Arrays;
import java.util.Scanner;

public class Challenge53_CountingNegativeNumbers {
    public static void main(String[] args) {
        readUserInput();
    }

    //1. read an array of integers from user using do while loop
    public static void readUserInput() {
        int userArraySize;
        do {
            Scanner arraySizeScan = new Scanner(System.in); //Read user input as string
            System.out.println("Please enter the size of the array (positive number): ");
            int arraySize = arraySizeScan.nextInt();
            userArraySize = arraySize;

        } while (userArraySize <= 0);

        //initialize empty array of known size
        int[] userArray = new int[userArraySize];
        System.out.println("An array with " + userArray.length + " elements has been created");
        System.out.println(Arrays.toString(userArray));

        Scanner arrayElementScan = new Scanner(System.in);
        System.out.println("Now, please enter " + userArray.length + " elements: ");

        int userInputElements = 0;
        for (int i = 0; i < userArray.length; i++) {
            userInputElements = arrayElementScan.nextInt();
            userArray[i] = userInputElements;
            System.out.println(Arrays.toString(userArray));

        }
        // +++++ count and print the number of negative elements from the array
    }
}


//2. main method
//3. user input read method
//4. count numbers print the number of negative integers in the array

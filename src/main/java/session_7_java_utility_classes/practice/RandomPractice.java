package session_7_java_utility_classes.practice;

import java.util.Random;

public class RandomPractice {
    public static void main(String[] args) {
        //printRandomNumbers(1, 500);

        int a = 10;
        int b = 25;

        int result = getNumbersSum(a, b);
        System.out.println("Value of result: " + result);
        printNumberSum(a, b);

    }

    public static int getNumbersSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public static void printNumberSum(int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);
    }


    public static void printRandomNumbers(int startInterval, int endInterval) {
        Random random = new Random();

        for (int index = 0; index < 100; index++) {
            System.out.println(random.nextInt(startInterval, endInterval));
        }


    }

}

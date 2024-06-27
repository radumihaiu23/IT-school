package session_8_recap.practice;

//Random Lottery Numbers
//Description: Write a method that generates and returns an array of 6 unique random integers
// between 1 and 49 (inclusive). Test the method and print the generated lottery numbers.

import java.util.Arrays;
import java.util.Random;

public class LotteryNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRandomNumber()));
    }

    public static int[] generateRandomNumber() {
        int[] array = new int[6];
        for (int index = 0; index <= 5; index++) {
            Random random = new Random();
            array[index] = random.nextInt(1,50);
        }
        return array;
    }
}

package session_5_advanced_flow_control.challenge;

/* For-Each Loop
Given an array of integers, write a program that prints each number in the array followed by "Even" if the number
is even, or "Odd" if the number is odd. Utilize a for-each loop for this task. */

public class Challenge59_ForEachLoop {
    public static void main(String[] args) {
        int[] arrayOfIntegers = new int[]{12, 25, 34, 46, 56, 77, 80, 101, -13, -190};
        for (int element : arrayOfIntegers) {
            if (element % 2 == 0) {
                System.out.println(element + " Even");
            } else {
                System.out.println(element + " Odd");
            }
        }
    }
}

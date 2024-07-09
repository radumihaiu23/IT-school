package session_6_java_core_apis.challenge;

import java.util.Scanner;

/* 2. Palindrome Checker
Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.
 *** palindrome tested: "taco cat", "nurses run", "UFO tofu", "Don’t nod"*/

public class Challenge62_PalindromeChecker {
    static String originalUserInput;
    static String reverseUserInput = "";

    public static void main(String[] args) {
        readUserInput();
        reverseInput();
        palindromeCheck();
    }

    public static void readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text to check if it's a palindrome: ");
        originalUserInput = sc.nextLine();
        originalUserInput = originalUserInput.toLowerCase();
        originalUserInput = originalUserInput.replace(" ", "");
        originalUserInput = originalUserInput.replace(",", "");
        originalUserInput = originalUserInput.replace("'", "");
        System.out.println("Original input: " + originalUserInput);
    }


    public static void reverseInput() {
        for (int i = originalUserInput.length() - 1; i >= 0; i--) {
            reverseUserInput += originalUserInput.charAt(i);
        }
        System.out.println("Reversed input: " + reverseUserInput);
    }

    public static void palindromeCheck() {
        boolean palindrome = true;
        for (int i = 0; i < originalUserInput.length(); i++) {
            if (originalUserInput.charAt(i) != reverseUserInput.charAt(i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(">> Input is palindrome !");
        } else {
            System.out.println(">> Input is not palindrome :( !");
        }
    }


}



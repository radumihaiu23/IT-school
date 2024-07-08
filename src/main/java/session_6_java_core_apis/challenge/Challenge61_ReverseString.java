package session_6_java_core_apis.challenge;

import java.util.ArrayList;
import java.util.Scanner;

/* 1. Reverse a String
Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh". */

public class Challenge61_ReverseString {
    public static void main(String[] args) {

        ArrayList<Character> characterList = new ArrayList<>();
        String reversedWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.println(">>> Please type a word to be reversed: ");
        String userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            characterList.add(userInput.charAt(i));
        }

        for (int i = characterList.size() - 1; i >= 0; i--) {
            reversedWord = reversedWord + characterList.get(i);
        }
        System.out.println("The word " + "\"" + userInput + "\" is: " + reversedWord);
    }
}

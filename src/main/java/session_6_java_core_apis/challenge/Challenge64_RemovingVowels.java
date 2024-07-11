package session_6_java_core_apis.challenge;

/*4. Removing Vowels
Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge64_RemovingVowels {
    static String userInput;
    static char character;

    public static void main(String[] args) {
        readUserInput();
        removeVowelFromString(userInput);
    }

    public static String readUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce text to remove vowels: ");
        userInput = sc.nextLine();
        return userInput;
    }

    public static void removeVowelFromString(String userInput) {
        StringBuilder userInputVowelRemove = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            character = userInput.charAt(i);
            switch (character) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                default:
                    userInputVowelRemove.append(character);
            }
        }
        System.out.println("Initial text: " + userInput);
        System.out.println("Text after vowel removal: " + userInputVowelRemove);
    }
}

package session_5_advanced_flow_control.challenge;
import java.util.Scanner;


/* 4. String Reverser:
Ask the user to enter a string. Print the reversed version of this string.*/


public class Challenge54_StringReverser {
    public static void main(String[] args) {
        stringReverser();                                                         //1. call function
    }

        public static String stringReverser(){
            Scanner sc = new Scanner(System.in);                                //2. get user input and store it in a variable
            System.out.println("Please enter a phrase to be reversed: ");
            String userInput = sc.nextLine();
            System.out.println("The following string0 will be reversed: " + userInput);

            String reversedString = "";                                         //3.initializing empty string variable
            for (int index=0; index<userInput.length() ; index++){              //4. write algorithm to loop each character from the given string
                reversedString = userInput.charAt(index) + reversedString;

            }
            System.out.println("Reversed string is: " + reversedString);        //5. print the result
            return userInput;                                                   //6. return the variable containing reversed string
        }
}

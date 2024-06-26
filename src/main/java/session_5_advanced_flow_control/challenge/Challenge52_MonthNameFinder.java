package session_5_advanced_flow_control.challenge;

//2. Month Name Finder
//Write a program that asks the user to enter a number between 1 and 12. Print the name of the corresponding month or "Invalid Month" if out of range.


import java.util.Scanner;

public class Challenge52_MonthNameFinder {
    public static void main(String[] args) {
        monthNameFinder();                                                        //1. Call method
    }
    public static void monthNameFinder() {
        Scanner sc = new Scanner(System.in);                                      //2. Read user input using Scanner class
        System.out.println("### Please type the month number: ");
        String userInput = sc.nextLine();
        System.out.println("The following integer will be checked: " + userInput);//3. Print to console user input

        int userIntegerInput = Integer.parseInt(userInput);                       //4. Convert user input from string to int

        switch (userIntegerInput){                                                //5. Use switch case to check one of 12 possible cases and print correct month
            case 1:
                System.out.println("January is the " + userIntegerInput + "st month of the year");
                break;
            case 2:
                System.out.println("February is the " + userIntegerInput + "nd month of the year");
                break;
            case 3:
                System.out.println("March is the " + userIntegerInput + "rd month of the year");
                break;
            case 4:
                System.out.println("April is the " + userIntegerInput + "th month of the year");
                break;
            case 5:
                System.out.println("May is the " + userIntegerInput + "th month of the year");
                break;
            case 6:
                System.out.println("June is the " + userIntegerInput + "th month of the year");
                break;
            case 7:
                System.out.println("July is the " + userIntegerInput + "th month of the year");
                break;
            case 8:
                System.out.println("August is the " + userIntegerInput + "th month of the year");
                break;
            case 9:
                System.out.println("September is the " + userIntegerInput + "th month of the year");
                break;
            case 10:
                System.out.println("October is the " + userIntegerInput + "th month of the year");
                break;
            case 11:
                System.out.println("November is the " + userIntegerInput + "th month of the year");
                break;
            case 12:
                System.out.println("December is the " + userIntegerInput + "th month of the year");
                break;
            default:
                System.out.println("Out of case");
        }
    }
}

package session_5_advanced_flow_control.practice;

public class JavaStatements {

    public static final int MAX_VALUE = 10;  // constanta ctrl+alt+c
    public static final int MAX_STRING_LENGHT = 5;

    public static void main(String[] args) {


        int number = 5;
        if (number > MAX_VALUE) {
            System.out.println("The number is greater than " + MAX_VALUE);
        } else {
            System.out.println("The number is not greater than " + MAX_VALUE);
        }


        String greeting = "Hello";
        if (greeting.length() > MAX_STRING_LENGHT) {
            System.out.println("String is too long");
        } else if (greeting.equals("Hello")) {
            System.out.println("The greeting is Hello");
        } else {
            System.out.println("Unknown greeting");
        }
    }
}

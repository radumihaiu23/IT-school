package session_5_advanced_flow_control.challenge;

/*8. For Loop
Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this. */

public class Challenge58_ForLoop {
    public static void main(String[] args) {
        printFibonacciSeries(10);
    }

    public static void printFibonacciSeries(int seriesLimit) {
        int firstElement = 0;
        int secondElement = 1;
        int nElement;

        if (firstElement == 0 && secondElement == 1) {
            System.out.println(firstElement);
            System.out.println(secondElement);

            for (int index = 0; index < seriesLimit; index++) {         // "series limit" parameter represents the n element of the fibonacci sequence
                nElement = firstElement + secondElement;
                firstElement = secondElement;
                secondElement = nElement;
                System.out.println(nElement);
            }
        }
    }
}

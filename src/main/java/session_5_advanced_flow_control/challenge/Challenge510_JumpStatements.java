package session_5_advanced_flow_control.challenge;
import java.util.Scanner;

/*10. Jump Statements
Create a menu-driven program where the user is presented with options:
Print "Hello World"
Print the user's name.
Exit.
Based on the user's input, perform the necessary action. Once an action is
completed, show the menu again, unless the user chooses the Exit option.
Use jump statements to control the flow of the program.
 */

public class Challenge510_JumpStatements {
    static String welcomeMessage = "Hello World!";
    static String menuOption1 = "Print ";
    static String menuOption2 = "Print username";
    static String menuOption3 = "Exit";
    static String userInput;
    static String storedUsername;
    static int menuNumber;

    public static void main(String[] args) {
        welcomeMenu();
        mainMenuOptions();
        mainMenuLogic();
    }

    public static void welcomeMenu() {
        System.out.println(" --- Please enter your username: --- ");
        readUserInput();
        storedUsername = userInput;
    }

    public static void readUserInput() {
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
    }

    public static void mainMenuOptions() {
        System.out.println("\n --- Please type the number of one of the following actions: --- ");
        System.out.println("1. " + menuOption1 + welcomeMessage);
        System.out.println("2. " + menuOption2);
        System.out.println("3. " + menuOption3);
    }

    public static void mainMenu() {
        menuNumber = Integer.parseInt(userInput);
        switch (menuNumber) {
            case 1:
                System.out.println(welcomeMessage);
                break;
            case 2:
                System.out.println("Username is: " + storedUsername);
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public static void mainMenuLogic() {
        do {
            readUserInput();
            mainMenu();
        } while (menuNumber != 3);
        System.out.println(menuOption3 + " menu option was chosen. The program will close in: ");
        for (int i = 0; i < 10; i++) {
            if (i == 1) {
                System.out.println(i + " second");
            }
            System.out.println(10 - i + " seconds");

        }
    }


}
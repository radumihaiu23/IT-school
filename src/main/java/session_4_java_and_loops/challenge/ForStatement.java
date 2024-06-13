package session_4_java_and_loops.challenge;

public class ForStatement {
    public static void main(String[] args) {
        printNumbers(10);
        int[] array = {1, 7, 3, 9 , 37};
        printArray(array);
    }
    //for (simple structure)
    public static void printNumbers(int number) {
        for (int index = 0; index < number; index++){
            System.out.println(index);
        }
    }

    //for (enhanced structure)
    public static void printArray(int[] numbersArray) {
        //numbersArray = {1, 7, 3, 9 , 37}
        for (int number : numbersArray){
            System.out.println(number);
        }
    }



}

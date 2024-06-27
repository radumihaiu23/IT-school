package session_8_recap.practice;

public class ArithmeticOperations {
    public static void main(String[] args) {

        //local variables (scope variables) - can be used only in the method which contains them
        int value1 = 10;
        int value2 = 46;
        int value3 = 63;
        int value4 = 27;

        System.out.println("Addition: " + sum(value1, value2));
        System.out.println("Addition2: " + sum(value3, value4));
        System.out.println("Subtraction: " +subtract(value1, value4));
    }

    public static int sum(int input1, int input2){
        return input1 + input2;
    }

    public static int subtract (int a, int b){
        return a + b;
    }

    public int test(){
        subtract(23,32);
        return 0;
    }

}

package session_3_java_operators.practice;

public class Variables {

    public static void main(String[] args) {
        int age; //declaration
        age = 27; //initialization
        int value = 10; //declaration and initialization

        //variable scope
        int outerVariable = 100;
        if (outerVariable > 50) {
            int innerVariable = 200;
            System.out.println(innerVariable + outerVariable);
        }
        //System.out.println(innerVariable); --> innerVariable is out of scope
        System.out.println(outerVariable);
    }
}
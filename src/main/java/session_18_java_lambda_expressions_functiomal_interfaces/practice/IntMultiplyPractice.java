package session_18_java_lambda_expressions_functiomal_interfaces.practice;

public class IntMultiplyPractice {
    public static void main(String[] args) {
        IntMultiply result = (x, y) -> x * y;
        System.out.println(result.multiply(2,3));
    }
}

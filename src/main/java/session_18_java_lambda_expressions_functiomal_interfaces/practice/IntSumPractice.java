package session_18_java_lambda_expressions_functiomal_interfaces.practice;

public class IntSumPractice {

    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;
        System.out.println(result.sum(10,15));
    }
}

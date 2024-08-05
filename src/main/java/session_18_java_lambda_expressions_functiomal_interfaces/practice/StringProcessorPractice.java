package session_18_java_lambda_expressions_functiomal_interfaces.practice;

public class StringProcessorPractice {

    public static void main(String[] args) {

        StringProcessor removeWhiteSpaces = str -> str.replace(" ", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println(combined.processor("Hello world"));
    }
}

package session_18_java_lambda_expressions_functiomal_interfaces.practice;

import java.util.Arrays;
import java.util.List;

public class DataProcessingPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "John", "Bob");

        //using streams & lambda (functional programming)
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        //using traditional way (imperative programming)
        for (String name : names) {
            if(name.startsWith("A")) {
                System.out.println(name);
            }
        }

    }
}

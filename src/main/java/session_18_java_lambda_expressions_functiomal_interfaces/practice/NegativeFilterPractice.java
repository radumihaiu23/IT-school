package session_18_java_lambda_expressions_functiomal_interfaces.practice;

import java.util.List;

public class NegativeFilterPractice {

    public static void main(String[] args) {
        NegativeFilter negativeFilter = numbers -> numbers.stream()
                .filter(num -> num < 0)
                .toList();


        List<Integer> numbers = List.of(-1,3,-5,7);
        System.out.println(negativeFilter.filter(numbers));
    }
}

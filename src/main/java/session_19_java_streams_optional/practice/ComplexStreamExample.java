package session_19_java_streams_optional.practice;

import java.util.Arrays;
import java.util.List;

public class ComplexStreamExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Billy", "Alice", "Janice");

        //filter names that start with "J"
        //make uppercase all names
        //sort names
        //collect the result into a new list

        List<String> resultList = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}

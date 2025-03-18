package session_19_java_streams_optional.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Billy", "Alice");

        //sort names in natural order and print them
        names.stream()
                .sorted()
                //.forEach(System.out::println);                //method reference
                .forEach(name -> System.out.println(name));     //lambda expression
    }
}

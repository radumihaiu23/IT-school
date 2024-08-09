package session_20_java_recap.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Problem3 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(7);
        myList.add(3);

        Optional<Integer> min = myList.stream().min(Integer::compareTo);
        min.ifPresent(minValue -> System.out.println(minValue));

        Optional<Integer> max = myList.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);

    }
}

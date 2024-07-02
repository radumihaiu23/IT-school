package session_9_arrays_arraylist_linkedlist_wrapperclasses.practice;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Charlie");
        names.add("John");


        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty ? " + isListEmpty);

        for (String name : names){
            System.out.println(name + " ");

        }

        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println(fruits.contains("Apple"));
        String cherryValue = fruits.get(2);
        System.out.println("Cherry value: " + cherryValue);

        for (int index = 0 ; index< fruits.size(); index++){
            System.out.print(fruits.get( index ) + " ");
        }



    }

}

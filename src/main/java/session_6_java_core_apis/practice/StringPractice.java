package session_6_java_core_apis.practice;

public class StringPractice {
    public static void main(String[] args) {
    //stringConcat()
    System.out.println(getStringLenght("Alice"));        //
    System.out.println(getStringChar("Frank", 1)); // print character at index 1 from string "Frank"
    System.out.println(isStringStartingWith("Hello", "He"));
    System.out.println(isStringEndingWith("Hello", "o"));
    System.out.println(getTrimmedString("      Bogdan   Employee "));

    String sentence = "I like to watch movies";
    //method chaining
    sentence = sentence
            .trim()
            .replace('o', 'a');
            //.toUpperCase();
    }

    public static String getTrimmedString(String input){
        return input.trim();
    }

    public static boolean isStringEndingWith(String input, String endsWith){
        return input.endsWith(endsWith);
    }

    public static char getStringChar(String input, int index){
        return input.charAt(index);
    }

    public static boolean isStringStartingWith(String input, String startsWith){
        return input.startsWith(startsWith);
    }

    public static int getStringLenght(String input){
        return input.length();
    }

    public static void stringConcat() {
        String value1 = "Alice";
        String value2 = "World";

        System.out.println(value1 + value2);
        System.out.println(value1.concat(value2));
    }
}

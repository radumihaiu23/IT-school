package session_20_java_recap.practice;

public class Problem1 {

    public static void main(String[] args) {
        String sentence = "Welcome all of java junior developers! ";
        String[] words = sentence.split(" ");

        int count = 0;
        for (String word : words) {
            if (word.length() > 3) {
                ++count;
            }
        }
        System.out.println(count);
    }
}
package session_6_java_core_apis.challenge;
/*3. Concatenate Multiple Strings
Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.
 */

public class Challenge63_ConcatenateMultipleStrings {
    public static void main(String[] args) {

        String[] arrayOfString = {"duck", "goose", "chicken", "turkey", "quail"};
        StringBuilder concatenatedString = new StringBuilder();

        for (String element : arrayOfString) {
            concatenatedString.append(element);
        }
        System.out.println(concatenatedString);
    }
}

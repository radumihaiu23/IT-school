package session_18_java_lambda_expressions_functiomal_interfaces.practice;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));



    }


}

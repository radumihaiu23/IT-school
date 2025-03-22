package session_3_java_operators.practice;

public class NumericPromotion {
    public static void main(String[] args) {

        short e = 10;
        int f = e + 5;

        long a = 10000000000L;
        //wrapper classes
        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("maxLongValue: " + maxLongValue);
        System.out.println("minLongValue: " + minLongValue);
        System.out.println("maxIntValue: " + maxIntValue + "\n");

        long testLongValue = 123123123123123123L;
        int newIntValue = (int) testLongValue; //cast

        System.out.println("Test long value: " + testLongValue);
        System.out.println("Test new int value: " + newIntValue);
    }
}
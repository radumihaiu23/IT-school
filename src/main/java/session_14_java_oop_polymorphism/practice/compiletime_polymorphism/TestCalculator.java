package session_14_java_oop_polymorphism.practice.compiletime_polymorphism;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2,10,1);
        System.out.println(result);
    }
}

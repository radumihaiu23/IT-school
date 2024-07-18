package session_14_java_oop_polymorphism.practice.compiletime_polymorphism;

public class Calculator {

    //overloading - same class only
    // same name but return type and parameter data type cam be different
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

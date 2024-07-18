package session_14_java_oop_polymorphism.practice.compiletime_polymorphism;

public class Geometry {

    //calculate are of a circle
    public double area(double radius){
        return Math.PI* radius * radius;
    }


    // calculate area of a triangle
    public double area(double base, double height){
        return (base * height)/2;
    }

}

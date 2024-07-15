package session_11_java_oop_inheritance_encapsulation.practice;

import java.util.Vector;

public class Vehicle {

    private String brand;
    private int speed;

    public void accelerate(){
        speed += 10;
    }

    public void brake(){
        speed -= 10;
    }



}

class Car extends Vehicle{
    @Override
    public void accelerate() {
        super.accelerate();
    }
}


class Bike extends Vehicle{
    @Override
    public void accelerate() {
        super.accelerate();
    }
}

package session_14_java_oop_polymorphism.practice.object_vs_reference;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        //ctrl+alt+b  - go to method implementation
        System.out.println(car.fuelType());
        System.out.println(truck.fuelType());

        //explicit casting
        Car anotherCar = (Car)car;



    }
}

package session_14_java_oop_polymorphism.practice.composition_over_inheritance.composition;

public class Car {

    //HAS-A -> car - engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

}

package session_14_java_oop_polymorphism.practice.runtime_polymorphism;

public class Orange extends Fruit{

    @Override
    public String taste() {
        return "orange is sour";
    }

    @Override
    public String colour() {
        return "orange is orange";
    }
}

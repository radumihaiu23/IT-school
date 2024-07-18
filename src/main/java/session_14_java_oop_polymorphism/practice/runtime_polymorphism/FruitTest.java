package session_14_java_oop_polymorphism.practice.runtime_polymorphism;

public class FruitTest {

    public static void main(String[] args) {
        printFruitDetails(new Apple());
        printFruitDetails(new Orange());
    }

    public static void printFruitDetails(Fruit fruit){
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.colour());
    }


}

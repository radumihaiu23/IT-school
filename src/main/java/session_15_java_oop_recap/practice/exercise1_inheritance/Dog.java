package session_15_java_oop_recap.practice.exercise1_inheritance;

public class Dog extends Animal {

    String breed;
    Size size;

    public Dog(String name, int age, String species, String breed, Size size) {
        super(name, age, species);
        this.breed = breed;
        this.size = size;
    }

    void bark() {
        System.out.println(name + " says wof!");
    }

    void fetch() {
        System.out.println(name + " brings me the ball");
    }


}

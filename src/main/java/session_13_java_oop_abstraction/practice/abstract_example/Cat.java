package session_13_java_oop_abstraction.practice.abstract_example;

import session_13_java_oop_abstraction.practice.interface_example.Pet;

public class Cat extends Animal implements Pet {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }


    @Override
    public void poop() {
        System.out.println("Dog is pooping");
    }
}

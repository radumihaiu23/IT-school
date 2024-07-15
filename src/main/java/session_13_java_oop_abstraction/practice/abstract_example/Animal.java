package session_13_java_oop_abstraction.practice.abstract_example;

import session_13_java_oop_abstraction.practice.interface_example.Pet;

public abstract class Animal implements Pet {

    public void eat(){
        System.out.println("This animal eats food ");
    }

    public abstract void makeSound();

    @Override
    public void poop() {

    }
}

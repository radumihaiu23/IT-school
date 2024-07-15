package session_11_java_oop_inheritance_encapsulation.practice;

public class Animal {

    void eat(){
        System.out.println("Animal is eating");
    }

}


class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }

}
class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
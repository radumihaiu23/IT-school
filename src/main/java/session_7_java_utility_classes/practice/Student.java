package session_7_java_utility_classes.practice;

import java.util.Objects;

public class Student {

    String name;
    int age;

    public void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

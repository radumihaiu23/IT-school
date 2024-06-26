package session_7_java_utility_classes.practice;

public class MainStudent {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "John";
        student1.age = 23;

        //System.out.println(student1.name);

        System.out.println(student1);   // prints the object reference address

        Student student2 = new Student();
        student2.name = "John2";
        student2.age = 22;

        System.out.println(student1.equals(student2));


    }
}

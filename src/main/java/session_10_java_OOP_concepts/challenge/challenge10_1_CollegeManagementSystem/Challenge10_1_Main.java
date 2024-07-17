package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;

import java.time.LocalDate;

public class Challenge10_1_Main {

    public static void main(String[] args) {

        // create some demo object for each class
        Student student1 = new Student("Ion", "Popescu", "male", LocalDate.of(2000,
                06, 05), 123456789, new Address("Victoriei", 19, "Brasov",
                "Fagaras"));

        Professor professor1 = new Professor("Andrei", "Georgescu", "male",
                LocalDate.of(1974, 12, 01), 909090909, new Address("Luptei",
                21, "Mures", "Sighisoara"));

        Course course1 = new Course("8:00 am", "2 hrs", "Introduction");


        Student student2 = new Student("Iulia", "Grigore", "Female",
                LocalDate.of(1999, 01, 21), 321321321, new Address("Fabricii", 87, "Constanta", "Corbu"));

        Professor professor2 = new Professor("Abdul", "Bari", "male",
                LocalDate.of(1969, 05, 03), 159159159, new Address("Berariei",
                61, "Vaslui", "Vaslui"));

        Course course2 = new Course("18:00 pm", "1 hr", "Java lesson 1");



        System.out.println(">>> Student info: \n" + student1 + "\n");
        System.out.println(">>> Professor info: \n" + professor1 + "\n");
        System.out.println(">>> Course info: \n" + course1 + "\n");

        System.out.println(">>> Student info: \n" + student2 + "\n");
        System.out.println(">>> Professor info: \n" + professor2 + "\n");
        System.out.println(">>> Course info: \n" + course2 + "\n");

    }
}

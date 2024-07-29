package session_17_java_equals_hashcode_generics.practice;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setId(1L);
        emp1.setFirstName("John");
        emp1.setLastName("Doe");

        Employee emp2 = new Employee();
        emp2.setId(1L);
        emp2.setFirstName("John");
        emp2.setLastName("Doe");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        System.out.println("employeeSet size: " + employeeSet.size());

        System.out.println("emp1: " + emp1);


    }

}


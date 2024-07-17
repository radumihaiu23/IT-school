package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;
import java.time.LocalDate;
import java.util.Calendar;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private long id;
    private Address address;

    public int studentAge (){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int studentAge = currentYear - dateOfBirth.getYear();
        return studentAge;
    }

    public Student(String firstName, String lastName, String gender, LocalDate dateOfBirth, long id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        String studentAttributes =
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Gender: " + gender + "\n" +
                "Birth date: " + dateOfBirth + "\n" +
                "Age: " + studentAge() + "\n" +
                "ID: " + id + "\n" +
                "Address: " + address + "\n";
        return studentAttributes;
    }
}

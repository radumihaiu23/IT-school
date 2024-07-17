package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;
import java.time.LocalDate;
import java.util.Calendar;

public class Professor {

    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private long id;
    private Address address;

    public int professorAge(){
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int professorAge = currentYear - dateOfBirth.getYear();
        return  professorAge;
    }

    public Professor(String firstName, String lastName, String gender, LocalDate dateOfBirth, long id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        String allProfessorAttributes =
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Gender : " + gender + "\n" +
                "Date of birth: " + dateOfBirth + "\n" +
                "Age : " + professorAge() + "\n" +
                "ID: " + id + "\n" +
                "Address: " + address + "\n";
        return allProfessorAttributes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

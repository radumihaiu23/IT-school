package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;

public class Course {

    private String schedule;
    private String duration;
    private String description;


    public Course(String schedule, String duration, String description) {
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public String getAssignedProfessor() {
        return Professor.getFirstName() + " " + Professor.getLastName();

    }

    @Override
    public String toString() {
        String allStringAttributes =
                "Schedule: " + schedule + "\n" +
                "Duration: " + duration + "\n" +
                "Description: " + description + "\n" +
                "Assigned professor: " + getAssignedProfessor() + "\n";
        return allStringAttributes;
    }
}

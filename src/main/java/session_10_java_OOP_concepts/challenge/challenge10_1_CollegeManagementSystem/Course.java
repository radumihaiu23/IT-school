package session_10_java_OOP_concepts.challenge.challenge10_1_CollegeManagementSystem;

//Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History. For each
// course, track details like its schedule, duration, description, and the assigned professor.

public class Course {
    static String math;
    static String computerScience;
    static String physics;
    static String chemistry;
    static String biology;
    static String geography;
    static String english;
    static String history;

    static String schedule;
    static String duration;
    static String description;
    static String assignedProfessor;

    public Course(String schedule, String duration, String description, String assignedProfessor){
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.assignedProfessor = assignedProfessor;
    }




}

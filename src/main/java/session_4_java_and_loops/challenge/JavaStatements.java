package session_4_java_and_loops.challenge;

public class JavaStatements {
    public static void main(String[] args) {
        int currentYear = 2024;
        int birthday = 1990;
        int age = currentYear - birthday;
        System.out.println("Age is: " + age);

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        int number = 20;
        if(number>0){
            System.out.println("Number is positive");
        }else if(number<0){
            System.out.println("Number is negative");
        }else{
            System.out.println(("Number is 0"));
        }

    }
}




package session_7_java_utility_classes.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimePractice {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDAteTime2 = localDateTime.plusDays(2);
        //System.out.println(localDateTime);
        //printLocalDateTimeDecrement(localDateTime, 5L);

        printLocalDateTimeDifference(localDateTime, localDAteTime2);

    }

    public static void printLocalDateTimeDecrement(LocalDateTime localDateTime, long decrement) {
        System.out.println(localDateTime.minusHours(decrement));
    }


    public static void printLocalDateTimeDifference(LocalDateTime startLocalDateTime, LocalDateTime endLocalDateTime) {
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();
        System.out.printf("Time difference is %d hours %d minutes, %d seconds ", hours, minutes, seconds);
    }

}

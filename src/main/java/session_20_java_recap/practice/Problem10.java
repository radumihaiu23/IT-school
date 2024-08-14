package session_20_java_recap.practice;

import java.time.LocalDate;
import java.util.*;

public class Problem10 {

    public static void main(String[] args) {
        List<Map<LocalDate, String>> entries = new ArrayList<>();

        Map<LocalDate, String> entryMap = new HashMap<>();
        entryMap.put(LocalDate.now(), "Hello World");
        entryMap.put(LocalDate.now().minusDays(1), "Title of the diary");
        entryMap.put(LocalDate.now().minusDays(2), "Hello journal");

        entries.add(entryMap);

        Diary diary = new Diary(entries);

        LocalDate searchDate = LocalDate.now().minusDays(1);

        Map<LocalDate, String> diaryMap = diary.getEntries().get(0);
        String diaryContent = diaryMap.get(searchDate);
        System.out.println(diaryContent);
    }
}
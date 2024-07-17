package session_13_java_oop_abstraction.practice.data_information_system;

import java.util.List;

public class CsvReport extends Report implements CsvExportable{
    public CsvReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {

    }


    @Override
    public void exportToCsv() {
        // code goes here
    }
}

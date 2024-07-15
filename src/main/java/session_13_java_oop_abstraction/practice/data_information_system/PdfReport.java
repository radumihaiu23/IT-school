package session_13_java_oop_abstraction.practice.data_information_system;

import java.util.List;

public class PdfReport extends Report implements PdfExportable {

    public PdfReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
        //code goes here
    }

    @Override
    public void exportToPdf() {

    }
}

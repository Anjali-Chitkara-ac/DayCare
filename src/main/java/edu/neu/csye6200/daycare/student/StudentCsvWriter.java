package Project.DayCare.student;

import Project.DayCare.CsvWriter;

public class StudentCsvWriter {

    public void writeToFile(String csvData) {

        //Create a file students.csv if it doesn't exist already
        // Write this new line to the student.csv
        CsvWriter csvWriter = new CsvWriter();
        csvWriter.writeToFile(csvData, "student.csv");

    }
}

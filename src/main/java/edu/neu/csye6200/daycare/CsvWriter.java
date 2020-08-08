package Project.DayCare;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;

public class CsvWriter {

    public void writeToFile(String csvData, String fileName) {

        //Create a file students.csv if it doesn't exist already
        // Write this new line to the student.csv
        System.out.println(csvData);

        try {
            final FileWriter sw = new FileWriter(fileName,true);
            final CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT);

            printer.printRecord(csvData);

            printer.flush();
            printer.close();
        } catch (Exception e) {
            System.out.println("Exception while writing to student.csv");
        }
    }
}

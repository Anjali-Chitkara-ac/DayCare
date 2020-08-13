package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.opensource.library.FileResource;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.FileWriter;

public class CsvWriter {

    public void writeToFile(String csvData, String fileName) {

        //Create a file .csv if it doesn't exist already
        // Write this new line to the .csv
        //append = true updates to the existing file
        try {
            FileResource fileResource = new FileResource(fileName, true);
            fileResource.write(csvData);
            
            //TODO: Fix the bug where it creates two additional lines at the end of each record
        } catch (Exception e) {
            System.out.println("Exception while writing to student.csv");
        }
    }
}

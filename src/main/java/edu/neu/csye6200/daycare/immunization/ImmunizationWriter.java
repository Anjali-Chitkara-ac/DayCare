package edu.neu.csye6200.daycare.immunization;

import edu.neu.csye6200.daycare.CsvWriter;


public class ImmunizationWriter {

    public void writeToFile(String csvData) {

        //Create a file imz.csv if it doesn't exist already
        // Write this new line to the student.csv
        CsvWriter csvWriter = new CsvWriter();
        csvWriter.writeToFile(csvData, "imz.csv");

    }
    
//    public static void main(String args[]){
//        ImmunizationWriter imzW = new ImmunizationWriter();
//        imzW.writeToFile("StudentId,groupID,PolioStatus,PolioDate,MaxPolioDoses,PolioDoesDone,RemainingPolioDoses");
//    }
    
}

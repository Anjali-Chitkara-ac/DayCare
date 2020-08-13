/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.opensource.library.FileResource;
/**
 *
 * @author anjali
 */

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

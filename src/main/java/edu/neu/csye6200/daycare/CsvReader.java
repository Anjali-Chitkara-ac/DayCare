/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.opensource.library.FileResource;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author anjali
 */
public class CsvReader {
    public CSVRecord readFromFile(String idName,String inputID,String fileName) {
        try {
            FileResource fr = new FileResource(fileName);
            CSVParser parser = fr.getCSVParser();

            for(CSVRecord r : parser) {
                if (r.get(idName).equals(inputID)) {
                    return r;
                }
            }
            return null;

        } catch (Exception e) {
            System.out.println("Exception while reading "+fileName+e);
            throw e;
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.immunization;

import edu.neu.csye6200.daycare.CsvReader;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.student.StudentGroup;
import java.util.Date;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author anjali
 */
public class ImmunizationReader {
    
    public ImmunizationReader(){
    }
    
    public String getImzData(String inputID) {
        //Open the imz.csv file
        //Get all the items
        //return where id matches else return empty string
        System.out.println("Reading data from imz.csv...");
        CsvReader reader = new CsvReader();
        CSVRecord info = reader.readFromFile("StudentID",inputID,"imz.csv");
        Immunization imzDetail = new Immunization();
        if(info == null) {
            System.out.println("IMMUNIZATION DETAIL NOT FOUND");
            return "IMMUNIZATION NOT FOUND";
        }

        //StudentId,groupID,PolioStatus,PolioDate,MaxPolioDoses,PolioDoesDone,RemainingPolioDoses
        
        //convert String to enum
        String grpID = info.get("GroupID");
        StudentGroup groupID_enum = StudentGroup.valueOf(grpID);
        imzDetail.setGroupID(groupID_enum);
        
        //convert String to boolean
        String s1 = info.get("PolioStatus");
        Boolean b1 = Boolean.parseBoolean(s1);
        imzDetail.setPolioStatus(b1);
        
        //convert String to date
        String p_date = info.get("PolioDate");
        try{
        Date P_Date = new Date(p_date);
        imzDetail.setPolioDate(P_Date);
        }catch(Exception e){
            System.out.println("Cannot read polio date"+e);
        }
        
        //convert String to int
        String maxPDoses = info.get("MaxPolioDoses");
        int max_PDoses = Integer.parseInt(maxPDoses);
        imzDetail.setMaxPolioDoses(max_PDoses);
        
        //convert String to int
        String p_done = info.get("PolioDoesDone");
        int p_dosesDone = Integer.parseInt(p_done);
        imzDetail.setPolioDosesDone(p_dosesDone);
        
        //convert String to int
        String p_rem = info.get("RemainingPolioDoses");
        int p_remDoses = Integer.parseInt(p_rem);
        imzDetail.setRemainingPolioDoses(p_remDoses);

        System.out.println("Immunization Details Found");
        return getImzDetails(imzDetail);//this returns a string of imz details
    }

    private String getImzDetails(Immunization imz) {
        String imzDetails =  "\n"+"\nImmunization Details:"+
                "\nGroup ID: " + imz.getGroupID()+
                "\nPolio Status: " + imz.getPolioStatus()+
                "\nPolio Date " +imz.getPolioDate()+
                "\nMax Polio Doses: " + imz.getMaxPolioDoses()+
                "\nPolio doses given: "+imz.getPolioDosesDone()+
                "\nPolio doses remaining "+imz.getRemainingPolioDoses();
          
        System.out.println(imzDetails);
        return imzDetails;

    }
}

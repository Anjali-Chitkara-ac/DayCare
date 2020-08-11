package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.immunization.Immunization;
import edu.neu.csye6200.daycare.immunization.ImmunizationReader;
import edu.neu.csye6200.daycare.immunization.ImmunizationWriter;
import edu.neu.csye6200.daycare.immunization.ImzReminder;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.student.StudentCsvReader;
import edu.neu.csye6200.daycare.student.StudentCsvWriter;
import java.util.Date;

public class DayCare {
    
    private DayCare(){
    }
    
    private static DayCare dayCare = new DayCare();
    
    public static synchronized DayCare getInstance(){
        return dayCare;
    }

    public void addStudent(Student student) {
        StudentCsvWriter studentCsvWriter = new StudentCsvWriter();
        studentCsvWriter.writeToFile(student.toString());
    }

    public String searchStudent(String studentId) {
        StudentCsvReader studentCsvReader = new StudentCsvReader();
        String studentDetails = studentCsvReader.getStudentData(studentId);
        
        ImmunizationReader imzReader = new ImmunizationReader();
        Immunization imzDetails = imzReader.getImzData(studentId);
        
        String allDetails = studentDetails + getImzDetails(imzDetails);
        
        return allDetails;
    }
    
    public ImzReminder getImzReminder(String studentId) {
        ImmunizationReader imzReader = new ImmunizationReader();
        Immunization imz = imzReader.getImzData(studentId);
        
        ImzReminder imzReminder = new ImzReminder();
        return imzReminder.getReminder(imz);
    }
    
    public void addImmzDetails(Immunization imz){
        ImmunizationWriter imzW = new ImmunizationWriter();
        imzW.writeToFile(imz.toString());
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
   
    
//    public String displyImzDetails(String studentId){
//        ImmunizationReader imzReader = new ImmunizationReader();
//        String imzDetails = imzReader.getImzData(studentId);
//        return imzDetails;
//    }
    
    //Add teacher
    //Search teacher
    //Add classroom
    //Search classroom
}

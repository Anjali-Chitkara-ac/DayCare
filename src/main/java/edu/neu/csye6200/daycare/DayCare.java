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
        System.out.println("#1");
        System.out.println(imzDetails);
        
        String allDetails = studentDetails + getImzDetails(imzDetails);
        
        return allDetails;
    }
    
    public ImzReminder getImzReminder(String studentId) {
        ImmunizationReader imzReader = new ImmunizationReader();
        Immunization imz = imzReader.getImzData(studentId);
        
        ImzReminder imzReminder = new ImzReminder();
        System.out.println("days left for polio " + imzReminder.getReminder(imz).getDaysLeftForPolio());
        return imzReminder.getReminder(imz);
    }
    
    public void addImmzDetails(Immunization imz){
        System.out.println("Inside day care " + imz.getRemainingPolioDoses());
        ImmunizationWriter imzW = new ImmunizationWriter();
        imzW.writeToFile(imz.toString());
    }
    
    private String getImzDetails(Immunization imz) {
        String imzDetails =  "\n"+"\nImmunization Details:"+
                "\nClass ID: " + imz.getGroupID()+
                "\nPolio Status: " + imz.getPolioStatus()+
                "\nPolio Date " + imz.getPolioDate()+
                "\nMax Polio Doses: " + imz.getMaxPolioDoses()+
                "\nPolio doses given: "+imz.getPolioDosesDone()+
                "\nPolio doses remaining "+imz.getRemainingPolioDoses()+
                
                "\n\nDtap Status: " + imz.getDtapStatus()+
                "\nDtap Date " +imz.getDtapDate()+
                "\nMax Dtap Doses: " + imz.getMaxDtapDoses()+
                "\nDtap doses given: "+imz.getDtapDosesDone()+
                "\nDtap doses remaining "+imz.getRemainingDtapDoses()+
                
                "\n\nHepatitis-B Status: " + imz.isHepaStatus()+
                "\nHepatitis-B Date " +imz.getHepaDate()+
                "\nMax Hepatitis-B Doses: " + imz.getMaxHepaDoses()+
                "\nHepatitis-B doses given: "+imz.getHepaDosesDone()+
                "\nHepatitis-B doses remaining "+imz.getRemainingHepaDoses()+
                
                "\n\nMmr Status: " + imz.isMmrStatus()+
                "\nMmr Date " +imz.getMmrDate()+
                "\nMax Mmr Doses: " + imz.getMaxMmrDoses()+
                "\nMmr doses given: "+imz.getMmrDosesDone()+
                "\nMmr doses remaining "+imz.getRemainingMmrDoses()+
                
                "\n\nVaricella Status: " + imz.isVarStatus()+
                "\nVaricella Date " +imz.getVarDate()+
                "\nMax Varicella Doses: " + imz.getVarDosesDone()+
                "\nVaricella doses given: "+imz.getVarDosesDone()+
                "\nVaricella doses remaining "+imz.getRemainingVarDoses()+
        
                "\n\nHib Status: " + imz.isHibStatus() +
                "\nHib Date " +imz.getHibDate()+
                "\nMax Hib Doses: " + imz.getMaxHibDoses()+
                "\nHib doses given: "+imz.getHibDosesDone()+
                "\nHib doses remaining "+imz.getRemainingHibDoses();
                
          
        System.out.println(imzDetails);
        return imzDetails;

    }
}

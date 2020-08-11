package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.immunization.Immunization;
import edu.neu.csye6200.daycare.immunization.ImmunizationReader;
import edu.neu.csye6200.daycare.immunization.ImmunizationWriter;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.student.StudentCsvReader;
import edu.neu.csye6200.daycare.student.StudentCsvWriter;

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
        String imzDetails = imzReader.getImzData(studentId);
        
        String allDetails = studentDetails+imzDetails;
        
        return allDetails;
    }
    
    public void addImmzDetails(Immunization imz){
        ImmunizationWriter imzW = new ImmunizationWriter();
        imzW.writeToFile(imz.toString());
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare;

import edu.neu.csye6200.daycare.classroom.ClassCsvReader;
import edu.neu.csye6200.daycare.classroom.ClassCsvWriter;
import edu.neu.csye6200.daycare.classroom.ClassRoom;
import edu.neu.csye6200.daycare.opensource.library.FileResource;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.student.StudentCsvReader;
import edu.neu.csye6200.daycare.student.StudentCsvWriter;
import edu.neu.csye6200.daycare.teacher.Teacher;
import edu.neu.csye6200.daycare.teacher.TeacherCsvReader;
import edu.neu.csye6200.daycare.teacher.TeacherCsvWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
/**
 *
 * @author anjali, Manasa
 */
public class DayCare {
    
    private DayCare(){
    }
    
    private static DayCare dayCare = new DayCare();
    
    public static synchronized DayCare getInstance(){
        return dayCare;
    }
    
// Adds Student data into Student.csv file.
    public void addStudent(Student student) {
        StudentCsvWriter studentCsvWriter = new StudentCsvWriter();
        studentCsvWriter.writeToFile(student.toString());
    }
    
//Searches Student data based on passed StudentID.
    public String searchStudent(String studentId) {
        StudentCsvReader studentCsvReader = new StudentCsvReader();
        String studentDetails = studentCsvReader.getStudentData(studentId);

        return studentDetails;
    }

//Adds Teacher data into Teacher.csv file    
    public void addTeacher(Teacher teacher) {
         TeacherCsvWriter tCsvWriter = new TeacherCsvWriter();
        tCsvWriter.writeToFile(teacher.toString());
    }

//Searches Teacher reacord based on the input Teacher ID.
    public String searchTeacher(String teacherId) {
        TeacherCsvReader tCsvReader = new TeacherCsvReader();
        String tDetails = tCsvReader.getTeacherData(teacherId);
        
        return tDetails;
    }
    
    public void updateTeacherStudent (int teacherId){
     String tempFile = "temp.csv";
      File teacherFile = new File("Teacher.csv");
      File newFile = new File(tempFile);
  /*   try {
            FileResource fr = new FileResource("Teacher.csv");
            CSVParser parser = fr.getCSVParser();
           
            System.out.println("Entering Teacher.csv getteacherlist!");
           for(CSVRecord r : parser) {
               System.out.println("record="+r);
            if((age >= 6) && (age <=12)){    
                if (r.get("AgeGroup").equalsIgnoreCase("6-12 months")){
                   studentAllowed = Integer.parseInt(r.get("StudentRatio"));          
                 }
            }else if((age >= 13) && (age <=24)){
                if (r.get("AgeGroup").equalsIgnoreCase("13-24 months")){
                    studentAllowed = Integer.parseInt(r.get("StudentRatio"));
                  }                
            }else if((age >= 25) && (age <=35)){
                if (r.get("AgeGroup").equalsIgnoreCase("25-35 months")){
                  studentAllowed = Integer.parseInt(r.get("StudentRatio"));
                }
            }else if((age >= 36) && (age <=47)){
                if (r.get("AgeGroup").equalsIgnoreCase("36-47 months")){
                   studentAllowed = Integer.parseInt(r.get("StudentRatio"));
                }
            }else if((age >= 48) && (age <=59)){
                if (r.get("AgeGroup").equalsIgnoreCase("48-59 months")){
                   studentAllowed = Integer.parseInt(r.get("StudentRatio"));
                }
            }else{
                if (r.get("AgeGroup").equalsIgnoreCase("60 months-above")){
                      studentAllowed = Integer.parseInt(r.get("StudentRatio"));
                }
            }
           }
        } catch (Exception e) {
            System.out.println("Exception while reading Ratio file"+e);
        }




      TeacherCsvReader tCsvReader = new TeacherCsvReader();
        String tDetails = tCsvReader.getTeacherData(teacherId);
     
      
        pwrite.println("TeacherID,TeacherName,Age,Sex,JoiningDate,ClassID,AgeGroup,StudentSize");*/
    try {
      FileWriter fw = new FileWriter(tempFile,true);       
      BufferedWriter buffer = new BufferedWriter(fw);
      PrintWriter pwrite = new PrintWriter(buffer);
     
      TeacherCsvReader tCsvReader = new TeacherCsvReader();
      //fetching highest teacher id
      int teachid = (tCsvReader.getLastestTeacherId());
        pwrite.println("TeacherID,TeacherName,Age,Sex,JoiningDate,ClassID,AgeGroup,StudentSize");
        //Starting teacher id = 201.

        for(int i = 201;i<(teachid+1);i++){ 
           CsvReader reader = new CsvReader();
           CSVRecord r = reader.readFromFile("TeacherID",Integer.toString(i),"Teacher.csv");
        
          int tempTeachId = Integer.parseInt(r.get("TeacherID"));
          String tempTeachName = r.get(1);
          String tempTeachAge = r.get("Age");
          String tempTeachSex = r.get(3);
          String tempTeachDate = r.get("JoiningDate");
          String tempTeachClassId = r.get("ClassID");
          String tempTeachAgeGroup = r.get("AgeGroup");
          int tempTeachStudSize = Integer.parseInt(r.get("StudentSize"));
 
         System.out.println("record="+(tempTeachId+","+tempTeachName+","+tempTeachAge+","+tempTeachSex
                      +","+tempTeachDate+","+tempTeachClassId+","+tempTeachAgeGroup+","+(tempTeachStudSize+1)));
       
      // Update teacher StudentSize   
          if(tempTeachId==teacherId){
              pwrite.println(tempTeachId+","+tempTeachName+","+tempTeachAge+","+tempTeachSex
                      +","+tempTeachDate+","+tempTeachClassId+","+tempTeachAgeGroup+","+(tempTeachStudSize+1));
              System.out.println("Reachedhere"+(tempTeachId+","+tempTeachName+","+tempTeachAge+","+tempTeachSex
                      +","+tempTeachDate+","+tempTeachClassId+","+tempTeachAgeGroup+","+(tempTeachStudSize+1)));
          }else{
                  pwrite.println(tempTeachId+","+tempTeachName+","+tempTeachAge+","+tempTeachSex
                      +","+tempTeachDate+","+tempTeachClassId+","+tempTeachAgeGroup+","+(tempTeachStudSize));
          }
        }
      pwrite.flush();
      pwrite.close();
      
     //Remove the old Teacher.csv file and replace with the temp file. 
      teacherFile.delete();
      File f = new File("Teacher.csv");
      newFile.renameTo(f);
     }    catch(Exception e){
     }   
    }

//Adds Class record in ClassRoom.csv file.    
    public void addClass (ClassRoom cObj) {
        ClassCsvWriter classCsvWriter = new ClassCsvWriter();
        classCsvWriter.writeToFile(cObj.toString());
    }

//Searches Class record based on the ClassID passed.    
    public String searchClass(String classId) {
        ClassCsvReader cCsvReader = new ClassCsvReader(); 
        String classDetails = cCsvReader.getClassData(classId);

        return classDetails;
    }
    
/* Updates the Teacher Size in ClassRoom.csv file 
  * when new teacher gets enrolled
  */          
    public void updateClassTeacher (String classId){
      String tempFile = "temp.csv";
      File classFile = new File("ClassRoom.csv");
      File newFile = new File(tempFile);
      String[] classList = {"A","B","C","D","E","F"};
    
    try{
      FileWriter fw = new FileWriter(tempFile,true);       
      BufferedWriter buffer = new BufferedWriter(fw);
      PrintWriter pwrite = new PrintWriter(buffer);
      
        pwrite.println("ClassID,TeacherSize,StudentSize,AgeGroup");
        for(String i: classList){ 
           CsvReader reader = new CsvReader();
           CSVRecord info = reader.readFromFile("ClassID",i,"ClassRoom.csv");
        
          String tempClassId = info.get("ClassID");
          int tempTeachSize = Integer.parseInt(info.get("TeacherSize"));
          int tempStudSize =  Integer.parseInt(info.get("StudentSize"));
          String tempagegp = info.get("AgeGroup");
          String agegp = (info.get("AgeGroup"));
          
      // Update teacher Size for the newly recuited Teacher's ClassId.    
          if(tempClassId.equals(classId)){
              pwrite.println(tempClassId+","+(tempTeachSize+1)+","+tempStudSize+","+tempagegp);
          }else{
             pwrite.println(tempClassId+","+(tempTeachSize)+","+tempStudSize+","+tempagegp); 
          }
        }
      pwrite.flush();
      pwrite.close();
      
     //Remove the old ClassRoom.csv file and replace with the temp file. 
      classFile.delete();
      File f = new File("ClassRoom.csv");
      newFile.renameTo(f);
     }    catch(Exception e){
     }   
    }
    public void updateClassStudent (String classId){
      String tempFile = "temp.csv";
      File classFile = new File("ClassRoom.csv");
      File newFile = new File(tempFile);
      String[] classList = {"A","B","C","D","E","F"};
    
    try{
      FileWriter fw = new FileWriter(tempFile,true);       
      BufferedWriter buffer = new BufferedWriter(fw);
      PrintWriter pwrite = new PrintWriter(buffer);
      
        pwrite.println("ClassID,TeacherSize,StudentSize,AgeGroup");
        for(String i: classList){ 
           CsvReader reader = new CsvReader();
           CSVRecord info = reader.readFromFile("ClassID",i,"ClassRoom.csv");
        
          String tempClassId = info.get("ClassID");
          int tempTeachSize = Integer.parseInt(info.get("TeacherSize"));
          int tempStudSize =  Integer.parseInt(info.get("StudentSize"));
          String tempagegp = info.get("AgeGroup");
          String agegp = (info.get("AgeGroup"));
          
      // Update teacher Size for the newly recuited Teacher's ClassId.    
          if(tempClassId.equals(classId)){
              pwrite.println(tempClassId+","+tempTeachSize+","+(tempStudSize+1)+","+tempagegp);
          }else{
             pwrite.println(tempClassId+","+(tempTeachSize)+","+tempStudSize+","+tempagegp); 
          }
        }
      pwrite.flush();
      pwrite.close();
      
     //Remove the old ClassRoom.csv file and replace with the temp file. 
      classFile.delete();
      File f = new File("ClassRoom.csv");
      newFile.renameTo(f);
     }    catch(Exception e){
     }   
    }

    
}

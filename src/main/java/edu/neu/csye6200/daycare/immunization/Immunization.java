package edu.neu.csye6200.daycare.immunization;
import edu.neu.csye6200.daycare.immunization.Vaccine.*;
import static edu.neu.csye6200.daycare.immunization.Vaccine.VaccineName.*;
import edu.neu.csye6200.daycare.student.StudentGroup;
import java.util.*;

public class Immunization {
    int StudentID;
    private StudentGroup groupID;
    
    boolean polioStatus; //info from user
    Date polioDate; //info from user
    private int maxPolioDoses; 
    private int polioDosesDone; //info from user
    private int remainingPolioDoses; //4 - 0 or 4 - x;

    boolean hibStatus;
    Date hibDate;
    private int maxHibDoses; //4
    private int hibDosesDone;
    private int remainingHibDoses;

    public int getPolioDosesDone() {
        return polioDosesDone;
    }

    public void setPolioDosesDone(int polioDosesDone) {
        this.polioDosesDone = polioDosesDone;
    }
    
    public void setMaxPolioDoses(){
        ImzMapper imz = ImzMapper.getInstance();
        List<Vaccine> vaccines = imz.mapToDosage(this.getGroupID());
        for(Vaccine v : vaccines) {
            if(POLIO == v.getVaccineName()) {
                this.maxPolioDoses =  v.getDosage();
            }
        }
    }

    public int getRemainingPolioDoses() {
        return remainingPolioDoses;
    }

    public void setRemainingPolioDoses(int remainingPolioDoses) {
        this.remainingPolioDoses = remainingPolioDoses;
    }
    
    public int getMaxPolioDoses(){
        return this.maxPolioDoses;
    }
    
    public StudentGroup getGroupID() {
        return groupID;
    }

    public void setGroupID(StudentGroup groupID) {
        this.groupID = groupID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public boolean getPolioStatus() {
        return polioStatus;
    }

    public void setPolioStatus(boolean polioStatus) {
        this.polioStatus = polioStatus;
    }

    public boolean getTbStatus() {
        return hibStatus;
    }

    public void setTbStatus(boolean tbStatus) {
        this.hibStatus = tbStatus;
    }

    public Date getPolioDate() {
        return polioDate;
    }

    public void setPolioDate(Date polioDate) {
        this.polioDate = polioDate;
    }

    public Date getTbDate() {
        return hibDate;
    }

    public void setTbDate(Date tbDate) {
        this.hibDate = tbDate;
    }

    @Override
    public String toString(){
        return this.getStudentID()+","+this.getGroupID()+","+this.getPolioStatus()+","+this.getPolioDate()+","+ 
               this.getMaxPolioDoses() +","+this.getPolioDosesDone()+","+this.getRemainingPolioDoses();
    }
}

package edu.neu.csye6200.daycare.student;

import edu.neu.csye6200.daycare.person.Person;
import static edu.neu.csye6200.daycare.student.StudentGroup.*;

import java.util.Date;

    public class Student extends Person {
        private int studentID;
        private StudentGroup groupID;
        private int teacherID;
        private String classID;
        private String parentsName;
        private String address;
        private String phoneNumber;
        private Date registrationDate;
        
        public StudentGroup getGroupID() {
            return groupID;
        }

        public void setGroupID(int age) {
            if(age>=6 && age<=12)
                this.groupID = GROUP_A;
            else if(age>=13 && age<=24)
                this.groupID = GROUP_B;
            else if(age>=25 && age<=35)
                this.groupID = GROUP_C;
            else if(age>=36 && age<=47)
                this.groupID = GROUP_D;
            else if(age>=48 && age<=59)
                this.groupID = GROUP_E;
            else if(age>=60)
                 this.groupID = GROUP_F;
        }

        public int getStudentID() {
            return studentID;
        }

        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        public int getTeacherID() {
            return teacherID;
        }

        public void setTeacherID(int teacherID) {
            this.teacherID = teacherID;
        }

        public String getClassID() {
            return classID;
        }

        public void setClassID(String classID) {
            this.classID = classID;
        }

        public String getParentsName() {
            return parentsName;
        }

        public void setParentsName(String parentsName) {
            this.parentsName = parentsName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        
        public Date getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(Date registrationDate) {
            this.registrationDate = registrationDate;
        }

        @Override
        public String toString() {
            return this.getStudentID() + "," + this.getTeacherID() + "," +this.getGroupID()+","+ this.getClassID() + "," + this.getAge()
                    +","+this.getName()+","+this.getSex()+","+this.getParentsName()+","+this.getAddress()+","+
                    this.getPhoneNumber()+","+this.getRegistrationDate();
        }
    }

package edu.neu.csye6200.daycare.student;

import edu.neu.csye6200.daycare.person.Person;

import java.util.Date;

    public class Student extends Person {
        private int studentID;
        private int teacherID;
        private String classID;
        private String parentsName;
        private String address;
        private String phoneNumber;
        private Date registrationDate;

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
            return this.getStudentID() + "," + this.getTeacherID() + "," + this.getClassID() + "," + this.getAge()
                    +","+this.getName()+","+this.getSex()+","+this.getParentsName()+","+this.getAddress()+","+
                    this.getPhoneNumber()+","+this.getRegistrationDate();
        }
    }

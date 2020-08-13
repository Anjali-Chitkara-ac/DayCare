package edu.neu.csye6200.daycare.student;

import edu.neu.csye6200.daycare.person.Person;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

    public class Student extends Person {
        private int studentID;
        private int teacherID;
        private String classID;
        private String parentsName;
        private String address;
        private int phoneNumber;
        private Date registrationDate;
        
        public Student () {
	super();
         }         
        public Student (String csvData) throws ParseException {
	Scanner Studentscan = new Scanner(csvData);
	Studentscan.useDelimiter(",");
        this.setStudentID(Studentscan.nextInt());
        this.setAge(Studentscan.nextInt());
        this.setName(Studentscan.next());
        this.setSex(Studentscan.next());
        this.setParentsName(Studentscan.next());
        this.setAddress(Studentscan.next());
        this.setPhoneNumber(Studentscan.next());
        String s =Studentscan.next();
        this.setRegistrationDate(new SimpleDateFormat("dd/MM/yy").parse(s));

	Studentscan.close();
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

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Integer.parseInt(phoneNumber);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.gui;
import edu.neu.csye6200.daycare.classroom.ClassRoom;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.teacher.MainTeacherFactory;
import edu.neu.csye6200.daycare.teacher.Teacher;
import edu.neu.csye6200.daycare.teacher.TeacherFactory;

/**
 *
 * @author Manasa
 */

/* This Class will:
* 1. Allocate Student to class based on its age
* 2. Allocate Teacher to the Student based on teacher availability.
* 3. Update Class and Teacher file.
*/
public class AllocateClass extends ClassRoom {

private TeacherFactory   teachFact = null;
private Teacher teacher = null;
static String[] TeachList = null;
    
    
public AllocateClass() {
}

public TeacherFactory getTeachFact() {
		return teachFact;
	}

public void setTeachFact(TeacherFactory teachFact) {
		this.teachFact = teachFact;
	}

public Teacher getTeacher() {
		return teacher;
	}

public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	
public static void demo(int age) {
		
		/*AllocateClass allocObj = new AllocateClass();
	
	
		
		//Adding PreCareTeacher Factory to classroom
		allocObj.setTeachFact(MainTeacherFactory.getInstance());
		
		//TeacherFactory tf = allocObj.getTeachFact();
		
		//Set teacher object
		
		allocObj.setTeacher(allocObj.getTeachFact().getObject(age));
		System.out.println("Reachded to get teacher and display");
	//Show list of teachers for PreCare Class
		allocObj.getTeacher().showall();
		
	// Checks available teacher and adds the student
		
		allocObj.getTeacher().add(allocObj.getTeacher().checkTeacher(),new Student("106,204,A,7,Anne,M,Darwin,Ames St,34565778,08/08/2020"));
		
	// Check teacher review
	//	allocObj.getTeacher().checkReview();*/
 
	}

}


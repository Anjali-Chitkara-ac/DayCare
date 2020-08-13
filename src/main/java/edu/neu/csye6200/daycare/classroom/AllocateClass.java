/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import edu.neu.csye6200.daycare.classroom.ClassRoom;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.teacher.MainTeacherFactory;
import edu.neu.csye6200.daycare.teacher.Teacher;
import edu.neu.csye6200.daycare.teacher.TeacherFactory;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Manasa
 */

/* PreClass includes students
*   of age group 6-12 months.
*/
public class AllocateClass extends ClassRoom {

private TeacherFactory   teachFact = null;
private Teacher teacher = null;
static String[] TeachList = null;
    
/*    
public PreCareClass(String studcsv) {
		studcsv = studcsv;
}
*/
    
/*public AllocateClass() {
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

/* This method will add Teacher A Teacher B Teacher C 
 * Teaching for 6-12 months students into a list
 * PreSchoolTeacherList
 */
/*	
public static void demo(int age) {
		
		AllocateClass allocObj = new AllocateClass();
	
	
		
		//Adding PreCareTeacher Factory to classroom
		allocObj.setTeachFact(MainTeacherFactory.getInstance());
		
		//TeacherFactory tf = allocObj.getTeachFact();
		
		//Set teacher object
		
		allocObj.setTeacher(allocObj.getTeachFact().getObject(age));
		
	//Show list of teachers for PreCare Class
		allocObj.getTeacher().showall();
		
	// Checks available teacher and adds the student
		
		allocObj.getTeacher().add(allocObj.getTeacher().checkTeacher(),new Student("106,204,A,7,Anne,M,Darwin,Ames St,34565778,08/08/2020"));
		
	// Check teacher review
		allocObj.getTeacher().checkReview();
 /*  TeachList =(PreCareobj.getTeacherList()).toArray(new String[0]);

		for(String i : TeachList){
			String[] Tlist = null;
			Scanner scan = new Scanner(i);
			scan.useDelimiter(",");
			String tname = scan.next();
			String ttype = scan.next();
			String tagegroup = scan.next();
			String tenroll = scan.next();
			int tsize = scan.nextInt();	
			scan.close();	
			
			PreCareobj.setTeacher(tf.getObject(tname,tagegroup));
		    Teacher ts = PreCareobj.getTeacher();
		     if (ts.check() == true) {
			    ts.add(PreCareobj.studFact.getObject(studcsv));
		      }
		}*/
	//}

}


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

/* AllocateClass is mainly used to instantiate factory design pattern object.
*  
*/
public class AllocateClass extends ClassRoom {
    private static AllocateClass allocObj = new AllocateClass();
    
    private AllocateClass(){
    }
    public static synchronized AllocateClass getInstance(){
        return allocObj;
    }
private TeacherFactory   teachFact = null;
private Teacher teacher = null;
static String[] TeachList = null;
}
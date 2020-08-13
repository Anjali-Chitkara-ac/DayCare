package edu.neu.csye6200.daycare.teacher;

import edu.neu.csye6200.daycare.DayCare;
import edu.neu.csye6200.daycare.opensource.library.FileResource;
import edu.neu.csye6200.daycare.student.Student;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;


/* AllocTeacher will allocate 
* Teacher to Student based on age group and availability.
 * 
 */

public class AllocTeacher extends Teacher{	

public AllocTeacher(int age) {
	super(age);
}
public AllocTeacher() {
	super();
}


/* Reads from file Teacher.csv and returns Tlist - that contains details of each teacher
 * in different lines comma separated values.
 * Input : null
 * Output: List<String> With PreCare teacher details.
 */

public List<String> getTeacherDetails(int age){
	List<String> Tlist = new ArrayList<String>();
    TeacherCsvReader tcsv = new TeacherCsvReader();
    List<String> tlst = new ArrayList<String>(tcsv.getTeacherList(age, "Teacher.csv"));
    System.out.println("Returning from get teacher list");	
    return Tlist;
        /*System.out.println("Reached AllocaTeacher get teach details");
    TeacherCsvReader tcsv = new TeacherCsvReader();
    List<String> tlst = new ArrayList<String>(tcsv.getTeacherList(age, "Teacher.csv"));
    for(String i: tlst){
    System.out.println(i);
            }
    return tlst;*/
}
    /*System.out.println("Reached AllocaTeacher get teach details");
    TeacherCsvReader tcsv = new TeacherCsvReader();
    List<String> tlst = new ArrayList<String>(tcsv.getTeacherList(age, "Teacher.csv"));
    for(String i: tlst){
    System.out.println(i);
            }
    return tlst;*/
	/*String[] Teacherlist = null;
	List<String> Tlist = new ArrayList<String>();
	
	  if((age >= 6) && (age <=12)){
			Tlist.add("Dan,PreCareTeacher,6-12,2020-09-01,4");
			Tlist.add("Tom,PreCareTeacher,6-12,2020-06-10,1");
			Tlist.add("Harry,PreCareTeacher,6-12,2019-09-01,4");
}else if((age >= 13) && (age <=24)){
	Tlist.add("Jennifer,PreCare2Teacher,13-24,2020-09-11,4");
	Tlist.add("Ray,PreCare2Teacher, 13-24,2020-01-10,4");
	Tlist.add("Ken,PreCare2Teacher,13-24,2019-09-01,0");
}else if((age >= 25) && (age <=35)){
	//add from file for 25-35
}else if((age >= 36) && (age <=47)){
	//add from file for 36-47
}else if((age >= 48) && (age <=59)){
	 //add from file for 48-59
}else{*/
	  //add from file for 60
///}
	
/*	CsvReader reader = new CsvReader();
        CSVRecord info = reader.readFromFile("AgeGroup",inputID,"Teacher.csv");
        Teacher t = new Teacher();
        if(info == null) {
            System.out.println("Teacher Not Found!");
            return "Teacher Not Found!";
        }

        t.setTeacherId(Integer.parseInt(info.get("TeacherID")));
        t.setTname(info.get(1));
        t.setAge(Integer.parseInt(info.get("Age")));
        t.setTsex(info.get(3));
        t.setJoiningDate(info.get("JoiningDate"));
        t.setClassId(info.get("ClassID"));
        t.setAgeGroup(info.get("AgeGroup"));
        t.setStudentSize(Integer.parseInt(info.get("StudentSize")));  
        
        System.out.println("Teacher Found");
        return getTeacherDetails(t);
          
          CsvReader reader = new CsvReader();
	Teacherlist = (reader.readFile("PreCareTeacher1","TeacherFile.csv")).toArray(new String[0]);	
	
	Scanner scan = new Scanner(Teacherlist[0]);
	scan.useDelimiter(",");--------------------------------------------> Reading Csv file for PreCareTeacher1
	Tlist.add(scan.next());
	Tlist.add(scan.next());
	Tlist.add(scan.next());
	Tlist.add(scan.next());
	Tlist.add(String.valueOf(scan.nextInt()));		
	scan.close();	*/
//	return Tlist;

/* Adds student to available teacher - 
 * increases student size in teacher file and 
 * adds reporting teacher name in student file
 * input - 1. Teacher available String 2.Student object
 * output - void; writes to student and teacher file.
 */

    public void add(String addTlist, Student t) {
    try {
        List<String> Tlist = new ArrayList<String>();
        System.out.println("addlist="+addTlist);
        System.out.println("Reached add of teacher!");
        Scanner scan = new Scanner(addTlist);
        scan.useDelimiter(",");
        
        int teacherID2 =scan.nextInt();
        String tname2 = scan.next();
        int tAge2 = scan.nextInt();
       String tSex2 = scan.next();
         String tJDate2 = scan.next();
         String teachClassId2 = scan.next();
         String teachAgeGroup2 = scan.next();
          int teachStudSize2 = scan.nextInt();
        scan.close();  
        
        //Update Student Size in Teacher File
        System.out.println("Updating teacher size"+teacherID2);
        DayCare dc = DayCare.getInstance();
        dc.updateTeacherStudent(teacherID2);
        
        //Add  New Student Record
        
           System.out.println("Updating new student");
        String studentString = t.getStudentID()+","+teacherID2+","+teachClassId2+","+
                t.getAge()+","+t.getSex()+","+t.getName()+","+t.getSex()+","+
                t.getParentsName()+","+t.getAddress()+","+t.getPhoneNumber()+","+t.getRegistrationDate();
        System.out.println(studentString+"String of student new");
        Student obj = new Student(studentString);
        dc.addStudent(obj);
        
        //Updating ClassRoom studentSize
        System.out.println("Updating Class size");
           System.out.println("Updating class size");
        dc.updateClassStudent(teachClassId2);

    } catch (ParseException ex) {
        Logger.getLogger(AllocTeacher.class.getName()).log(Level.SEVERE, null, ex);
    }

	}


// Remove Teacher from the file.

	public void remove() {
	  /* Read the Teacher File .csv for the given teacher id and remove the line from file.
	   */
	}
	
// Show all teachers for given age group
@Override
	/*public void showall() {
           /* System.out.println("show all in allocate class");
            String showTeacher = "";
            TeacherCsvReader tcsv = new TeacherCsvReader();
            String[] showTlist = (tcsv.getTeacherList(this.getAge(), "Teacher.csv").toArray());
	       System.out.println("\nTeacher details are :\n"); 
			for (String i: showTlist){
				Scanner showscan = new Scanner(i);
				showscan.useDelimiter(",");
				   System.out.println("TeacherID: "+showscan.nextInt()
                                           +", Teacher name:"+showscan.next()
                                           +", Age: "+showscan.nextInt()+
                                           ", Sex: "+showscan.next()+
                                           ", Joining Date :"+showscan.next()+
                                           ", ClassID: "+showscan.next()+
                                           ", AgeGroup: "+showscan.next()+
                                           ", StudentSize: "+showscan.nextInt());
        
                        }*/
   public void showall() {
            System.out.println("show all in allocate class");
            String showTeacher = "";
            TeacherCsvReader tcsv = new TeacherCsvReader();
            List<String> showTlist = new ArrayList<String>(tcsv.getTeacherList(this.getAge(), "Teacher.csv"));
	       System.out.println("\nTeacher details are :\n"); 
			for (String i: showTlist){
				Scanner showscan = new Scanner(i);
				showscan.useDelimiter(",");
				   System.out.println("TeacherID: "+showscan.nextInt()
                                           +", Teacher name:"+showscan.next()
                                           +", Age: "+showscan.nextInt()+
                                           ", Sex: "+showscan.next()+
                                           ", Joining Date :"+showscan.next()+
                                           ", ClassID: "+showscan.next()+
                                           ", AgeGroup: "+showscan.next()+
                                           ", StudentSize: "+showscan.nextInt());
                                  
			}
		    
	}	
	
/* Checks the availability of teacher 
 * based on Student teacher ratio file - StudentRatio.csv
 * returns TeacherList that is available in a String.
 * 
 * Input: void.
 * Output : String containing available Teacher data comma separated .
 */

public String checkTeacher() {
   String availTeacher = null;
   String Ratiolist = null;
   int studentAllowed =0 ;
   System.out.println("Reached checkteacher!");
// Ratio list has 1. Age 2. group size 3.Student teacher ratio 4. max groups.
/*		CsvReader checkread = new CsvReader();
		Ratiolist = (checkread.readFile("6-12","StudentRatio.csv")).toArray(new String[0]);	*/
	/*  if((this.getAge() >= 6) && (this.getAge() <=12)){
		  Ratiolist = "6-12,4,4,3";
}else if((this.getAge() >= 13) && (this.getAge() <=24)){
	Ratiolist = "13-24,5,5,3";
}else if((this.getAge() >= 25) && (this.getAge() <=35)){
	//add from file for 25-35
}else if((this.getAge() >= 36) && (this.getAge() <=47)){
	//add from file for 36-47
}else if((this.getAge() >= 48) && (this.getAge() <=59)){
	 //add from file for 48-59
}else{
	  //add from file for 60
}   */
        try {
            FileResource fr = new FileResource("Ratio.csv");
            CSVParser parser = fr.getCSVParser();
           
            System.out.println("Entering Ratiocsv getteacherlist!");
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
	System.out.println("Student allowed: "+studentAllowed);
  //      String[] addTlist = this.getTeacherDetails(this.getAge()).toArray(new String[0]);	
            TeacherCsvReader tcsv2 = new TeacherCsvReader();
            List<String> addTlist = new ArrayList<String>(tcsv2.getTeacherList(this.getAge(), "Teacher.csv"));
	       

   //  String[] addTlist = this.getTeacherDetails(this.getAge()).toArray(new String[0]);
//  List<String> addTlist = this.getTeacherDetails(this.getAge());	
   boolean breakLoop = false;
  //    System.out.println("Tlist:"+addTlist[1]);
     while (!breakLoop) {
         System.out.println("Enters while loop!");
      for (String i: addTlist) {   
          System.out.println("inside Tlist loop"+i);
  		Scanner Teacherscan = new Scanner(i);
  	//	System.out.println(i);
  		Teacherscan.useDelimiter(",");
        int teacherID =Teacherscan.nextInt();
        String tname = Teacherscan.next();
        int tAge = Teacherscan.nextInt();
       String tSex = Teacherscan.next();
         String tJDate = Teacherscan.next();
         String teachClassId = Teacherscan.next();
         String teachAgeGroup = Teacherscan.next();
          int teachStudSize = Teacherscan.nextInt();

  		Teacherscan.close();
                System.out.println("size="+teachStudSize+studentAllowed);
		if(teachStudSize < studentAllowed){
                    System.out.println("Inside checking student zie");
			availTeacher = i;
			breakLoop = true ;
		}
    	  }
      }
     System.out.println("availteacher="+availTeacher);
      return availTeacher;
	}
    
	public void checkReview(){
/*	       String[] showTlist = this.getTeacherDetails().toArray(new String[0]);	
            if((Integer.parseInt(showTlist[3]) + 365) >= Integer.parseInt(java.time.LocalDate.now())-10) {
            	System.out.println("Alert review near!!!");
            }
		List<String> alert = new ArrayList<String>();
		String[] showTlist = this.getTeacherDetails().toArray(new String[0]);
		for (String i: showTlist) {   	  
	  		Scanner Teacherscan = new Scanner(i);
	  		Teacherscan.useDelimiter(",");
	  		String tname = Teacherscan.next();
	  		String ttype = Teacherscan.next();
	  		String tagegp = Teacherscan.next();
	  		String tdate = Teacherscan.next();	
	  		int tsize = Teacherscan.nextInt();
	  		Teacherscan.close();
	  		try {
	  		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	  		Date date = format.parse(tdate);
	  		System.out.println((int(date)));
	  		
	  		}catch (ParseException e) {
	  		    e.printStackTrace();
	  		}
			if(tsize < (Integer.parseInt(size))) {
				System.out.println("tsize ="+tsize+" size :"+size );
				availTeacher = i;
				breakLoop = true ;
			}
		    }*/
	}

	
/*Used for testing purpose.
 * 
 * 	public static void demo() {
		String tlist = null;
		
		PreCare2Teacher obj = new PreCare2Teacher();
		tlist = obj.getTeacherDetails().toArray(new String[0]);
		System.out.println(tlist);
		for (String i: tlist){
			System.out.println(i);
		}
		
// Adds student to available teacher.
 * 		
		obj.add(obj.checkTeacher(),new PreCareStudent("Mark,7,M,Darwin,Ames St.,34565778"));
		
// Shows all PreCare2Teacher data.		
		obj.showall();

			
	}*/

}
	

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.gui;

import edu.neu.csye6200.daycare.DayCare;
import edu.neu.csye6200.daycare.immunization.Immunization;
import edu.neu.csye6200.daycare.immunization.ImzReminder;
import edu.neu.csye6200.daycare.opensource.library.FileResource;
import edu.neu.csye6200.daycare.student.RenewalReminder;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

/**
 *
 * @author anjali
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("StudentID");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("TeacherID");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("ClassID");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton3.setText("Show Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("Display Teacher Complete Detail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jButton6.setText("Display ClassRoom Complete Details");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3)))
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton7)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Search teacher
        String inputID = jTextField2.getText();
        System.out.println("Search Pressed,Searching Teacher...");
        DayCare dc = DayCare.getInstance();
        String tDetails = dc.searchTeacher(inputID);
        jTextArea1.setText(tDetails);
            
        String joinDate;
        String alertmsg="";
        try {
            FileResource fr = new FileResource("Teacher.csv");
            CSVParser parser = fr.getCSVParser();
              
            for(CSVRecord r : parser) {
  
            if ((r.get("TeacherID").isEmpty()!= true)&&(r.get("TeacherID").equalsIgnoreCase(inputID))){
            
            joinDate = (r.get("JoiningDate"));
            SimpleDateFormat myFormat = new SimpleDateFormat("dd/M/yy"); 
            Date objdate = myFormat.parse(joinDate);
            Date present = new Date();
            long difference = present.getTime() - objdate.getTime();
	    float daysBetween = (difference / (1000*60*60*24));
            
            
            if((daysBetween > 365)) {
                float yearWorked = (daysBetween/365);
                alertmsg+=("ID: "+r.get("TeacherID")+
                        " is up for review!!!\n");
                alertmsg+=("Review:- Teacher ID: "+r.get("TeacherID")+", Name:"+r.get("TeacherName")+
                        "\nhas worked for "+yearWorked+" years with our DayCare\n and currently has "+r.get("StudentSize")+" students of age group"+r.get("AgeGroup")+".\n");
                
             }           
            }
            }
           if(alertmsg.isEmpty()){           
               alertmsg="No annual review coming up in near future!!!";
           }
                  JOptionPane.showMessageDialog(null, alertmsg, "InfoBox: " + "Reminder", JOptionPane.INFORMATION_MESSAGE);
          

        } catch (Exception e) {
            System.out.println("Exception while reading file"+e);
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // search student
        String inputID = jTextField1.getText();
        System.out.println("Search Pressed,Searching Student ID...");
        //parse through student.csv file
        //if id is found
        //display the details in the text area
        DayCare dc = DayCare.getInstance();
        String studentDetails = dc.searchStudent(inputID);
        jTextArea1.setText(studentDetails);
        
        ImzReminder ir = dc.getImzReminder(inputID);
        ir.getDaysLEftForVaricella();
        ir.getDaysLeftForDtap();
        ir.getDaysLeftForHepa();
        ir.getDaysLeftForHib();
        ir.getDaysLeftForMMR();
        ir.getDaysLeftForPolio();
        
        //if not due, i.e dose complete, do something
        //get remaining days for all vaccines and print here
        
        String message = "Polio due in " + ir.getDaysLeftForPolio() + " days" 
                +"\nDtap due in "+ir.getDaysLeftForDtap()+" days"
                +"\nHib due in "+ir.getDaysLeftForHib()+" days"
                +"\nHepa due in "+ir.getDaysLeftForHepa()+" days"
                +"\nMMR due in "+ir.getDaysLeftForMMR()+" days"
                +"\nVaricella due in "+ir.getDaysLEftForVaricella()+" days";
        
        JOptionPane.showMessageDialog(null, message, "InfoBox: " + "Reminder", JOptionPane.INFORMATION_MESSAGE); 
        
        RenewalReminder rr = dc.getRenewalreminder(inputID);
        rr.getDaysLeftForRegistrationRenewal();
        
        String message2 = "Renew registration in " +rr.getDaysLeftForRegistrationRenewal()+  " days";
        JOptionPane.showMessageDialog(null, message2, "InfoBox: " + "Reminder", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String inputID = jTextField3.getText();
        System.out.println("Search Pressed,Searching Class...");
        DayCare dc = DayCare.getInstance();
        String cDetails = dc.searchClass(inputID);
        jTextArea1.setText(cDetails);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           try{
      DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
      String teacherString = "Teacher ID,Teacher Name,AgeGroup,Student ID,Student Name, Class ID";
      String[] teacherTableHeader = teacherString.split(",");
      m.setColumnIdentifiers(teacherTableHeader);
      
      //Fetch teacher records
      //first for loop will loop through teacher records in teacher csv file
      //inner for loop will loop through student record and will add rows for mapped teacher id.
      FileResource fr = new FileResource("Teacher.csv");
      CSVParser parser = fr.getCSVParser();
           for(CSVRecord r : parser) {
            String teacherRecord = "";
            String teacherstudentRecord = "";
            if (r.get("TeacherID").isEmpty()!= true){
                teacherRecord+=r.get("TeacherID")+","+r.get("TeacherName")+","+r.get("AgeGroup");
                      FileResource fr2 = new FileResource("Student.csv");
                      CSVParser parser2 = fr2.getCSVParser();
                      for(CSVRecord r2 : parser2) {
                          
                      if ((r2.get("StudentID").isEmpty()!= true)&&(r2.get("TeacherID").equalsIgnoreCase(r.get("TeacherID"))) ){
                         teacherstudentRecord=","+r2.get("StudentID")+","+r2.get("Name")+","+r2.get("ClassID");
                         teacherRecord+=teacherstudentRecord;
                         String[] teacherRecordRow = teacherRecord.split(",");
                         m.addRow(teacherRecordRow);
                         }
                      }
                      if(teacherstudentRecord.isEmpty()){
                          teacherstudentRecord=",-,-,-";
                          teacherRecord+=teacherstudentRecord;
                         String[] teacherRecordRow = teacherRecord.split(",");
                         m.addRow(teacherRecordRow);
                      }
              }
            }
    }catch (Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          try{
      DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
      String teacherString = "ClassRoom ID,AgeGroup,Student Size,TeacherSize,Teacher ID,Teacher Name,Student ID,Student Name";
      String[] teacherTableHeader = teacherString.split(",");
      m.setColumnIdentifiers(teacherTableHeader);
      
      //Fetch teacher records
      //first for loop will loop through teacher records in teacher csv file
      //inner for loop will loop through student record and will add rows for mapped teacher id.
      FileResource fr = new FileResource("ClassRoom.csv");
      CSVParser parser = fr.getCSVParser();
           for(CSVRecord r : parser) {
            String classRecord = "";
            String classstudentRecord = "";
            String tname = "";
            if (r.get("ClassID").isEmpty()!= true){
                  classRecord+=r.get("ClassID")+","+r.get("AgeGroup")+","+r.get("StudentSize")+","+r.get("TeacherSize");
                      FileResource fr2 = new FileResource("Student.csv");
                      CSVParser parser2 = fr2.getCSVParser();
                      
                      for(CSVRecord r2 : parser2) {
                      if ((r2.get("StudentID").isEmpty()!= true)&&(r2.get("ClassID").equalsIgnoreCase(r.get("ClassID"))) ){
                                FileResource fr3 = new FileResource("Teacher.csv");
                                CSVParser parser3 = fr3.getCSVParser();
                                for(CSVRecord r3 : parser3){  
                                    if ((r3.get("TeacherID").isEmpty()!= true)&&(r3.get("TeacherID").equalsIgnoreCase(r2.get("TeacherID")))){
                                        tname = r3.get("TeacherName");
                                       
                                    }
                                }
                                if((tname).isEmpty()){
                                    tname = "-";
                                }
                        classstudentRecord=","+r2.get("TeacherID")+","+tname+","+r2.get("StudentID")+","+r2.get("Name")+","+r2.get("ClassID");
                        classRecord+=classstudentRecord;
                         String[] classRecordRow = classRecord.split(",");
                         m.addRow(classRecordRow);
                         }
                 
                      }
                      if(classstudentRecord.isEmpty()){
                          classstudentRecord=",-,-,-,-";
                          classRecord+=classstudentRecord;
                         String[] classRecordRow = classRecord.split(",");
                         m.addRow(classRecordRow);
                      }
              }
            }
    }catch (Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindow().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

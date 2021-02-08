/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ELCOT
 */
public class StudentDataEditAndView extends javax.swing.JFrame {

    /**
     * Creates new form StudentDataEditAndView
     */
    
    
     Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
       static String administrationnumber;
    static String Firstname;
    static    String Lastname;
    static   String Fathername;
    static String Mothername;
    static   String Instrutename;
    static String Studentnumber;
    static String Contactnumber;
    static String Addharnumber;
    static String Mailid;
    static String Course;
    static String address;
    static  String Religion;
    static  String Year;
    static  String AcademyBackground;
    static  String Gender;
    static  String Institute ;
    static String Dob;
    static String Payment ; 
    static String Coursefees;
    static String Gst;
    static String Amountpaid; 
    static String Balanceamount;
    static String PG;
    static String Group;
    static String StudentWa;
    static String ParentsWa;
    static String dateTime;
    static  String totalcoursefees;
    
    public StudentDataEditAndView() {
        initComponents();
          con=ConnectionDb.DbConnection();
          DisplayTable();
    }
    
    
    private void DisplayTable(){
         try{
                   String sql="Select * FROM Registrationtable";
                   pst =con.prepareStatement(sql);
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("1");
            }catch(Exception e){
                 System.out.println("2"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("3");
                 }catch(Exception e){
                     System.out.println("4"+e);
                 }
             }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowData = new javax.swing.JTable();
        PrintOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Student Data");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        ShowData.setAutoCreateRowSorter(true);
        ShowData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ShowData.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(ShowData);
        ShowData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        PrintOutButton.setBackground(new java.awt.Color(255, 255, 255));
        PrintOutButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        PrintOutButton.setText("Print");
        PrintOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addComponent(PrintOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addGap(20, 20, 20)
                .addComponent(PrintOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminOptionForm adminoption = new AdminOptionForm();
        adminoption.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PrintOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintOutButtonActionPerformed
        // TODO add your handling code here:
         String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
                
                if(x==JFileChooser.APPROVE_OPTION){
                    path=j.getSelectedFile().getPath();
                }
               Document doc=new Document();
               
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Bill1.pdf"));
            
            doc.open();
            PdfPTable tbl=new PdfPTable(29);
            
            
            tbl.addCell( "administrationnumber");
            tbl.addCell( "Firstname");
            tbl.addCell( "Lastname");
            tbl.addCell( "Fathername");
            tbl.addCell( "Mothername");
            tbl.addCell( "Religion");
            tbl.addCell( "Dob");
            tbl.addCell( "Gender");
            tbl.addCell( "Institute");
            tbl.addCell( "Instrutename");
            tbl.addCell( "AcademyBackground");
            tbl.addCell( "Group");
            tbl.addCell( "Year");
            tbl.addCell( "Course");
            tbl.addCell( "PG");
            tbl.addCell( "Studentnumber");
            tbl.addCell( "StudentWa");
            tbl.addCell( "Contactnumber");
            tbl.addCell( "ParentsWa");
            tbl.addCell( "Addharnumber");
            tbl.addCell( "Mailid");
            tbl.addCell( "address");
            tbl.addCell( "Payment");
            tbl.addCell( "Coursefees");
            tbl.addCell( "Gst");
            tbl.addCell( "Amountpaid");
            tbl.addCell( "totalcoursefees ");
            tbl.addCell( "Balanceamount");
            tbl.addCell( "dateTime");
            
       
           try{
                   String sql="Select * FROM Registrationtable";
                   pst =con.prepareStatement(sql);
                   rs=pst.executeQuery();
                   administrationnumber=rs.getString("administrationnumber");
                   Firstname=rs.getString("Firstname");
                   Lastname=rs.getString("Lastname");
                   Fathername=rs.getString("Fathername");
                   Mothername=rs.getString("Mothername");
                  Religion=rs.getString("Religion");
                    Dob=rs.getString("Dob");
                   Gender=rs.getString("Gender");
                  Institute=rs.getString("Institute");
                   Instrutename=rs.getString("Institutename");
                   AcademyBackground=rs.getString("AcademyBackground");
                   Group=rs.getString("grouptype");
                   Year=rs.getString("Year");
                  Course=rs.getString("Course");
                   PG=rs.getString("Parentguardian");
                   Studentnumber=rs.getString("Studentnumber");
                   StudentWa=rs.getString("StudentWhatsapp");
                   Contactnumber=rs.getString("Parentnumber");
                   ParentsWa=rs.getString("ParentsWhatsapp");
                   Addharnumber=rs.getString("Addharnumber");
                   Mailid=rs.getString("Mailid");
                   address=rs.getString("address");
                    Payment=rs.getString("Payment");
                   Coursefees=rs.getString( "Coursefees");
                 Gst=rs.getString("Gst");
                  Amountpaid=rs.getString("Amountpaid");
                   totalcoursefees=rs.getString("totalfees");
                   Balanceamount=rs.getString("Balanceamount");
                   dateTime=rs.getString("dateTime");
                  
                  
            
                    System.out.println("1");
            }catch(SQLException e){
                 System.out.println("2"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("3");
                 }catch(SQLException e){
                     System.out.println("4"+e);
                 }
             }
           
             tbl.addCell( administrationnumber);
            tbl.addCell( Firstname);
            tbl.addCell( Lastname);
            tbl.addCell(Fathername);
            tbl.addCell( Mothername);
            tbl.addCell( Religion);
            tbl.addCell(Dob);
            tbl.addCell( Gender);
            tbl.addCell( Institute);
            tbl.addCell( Instrutename);
            tbl.addCell( AcademyBackground);
            tbl.addCell( Group);
            tbl.addCell( Year);
            tbl.addCell( Course);
            tbl.addCell( PG);
            tbl.addCell( Studentnumber);
            tbl.addCell( StudentWa);
            tbl.addCell( Contactnumber);
            tbl.addCell( ParentsWa);
            tbl.addCell( Addharnumber);
            tbl.addCell( Mailid);
            tbl.addCell( address);
            tbl.addCell( Payment);
            tbl.addCell( Coursefees);
            tbl.addCell( Gst);
            tbl.addCell( Amountpaid);
            tbl.addCell( totalcoursefees);
            tbl.addCell(Balanceamount);
            tbl.addCell( dateTime);
            
       
            doc.add(tbl);
            
            
            System.out.println("Printout Sucessfull");
            
        } catch (FileNotFoundException | DocumentException ex) {
            java.util.logging.Logger.getLogger(PrintoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             System.out.println("Printout Fails"+ex);
        }
         doc.close();      
          JOptionPane.showMessageDialog(rootPane,"Downloaded");
    }//GEN-LAST:event_PrintOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDataEditAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDataEditAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDataEditAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDataEditAndView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDataEditAndView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintOutButton;
    private javax.swing.JTable ShowData;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

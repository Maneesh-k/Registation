/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ELCOT
 */
public class AdminStudentdata extends javax.swing.JFrame {

    /**
     * Creates new form AdminStudentdata
     */
    
     Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
      static String Payment ; 
    static int Coursefees;
    static int Gst;
    static int Amountpaid; 
    static int Balanceamount;
    static  int totalcoursefees;
    
    public AdminStudentdata() {
        initComponents();
          updatePanel.setVisible(false);
         con=ConnectionDb.DbConnection();
    
     FirstNamePanel.setVisible(false);
           LasttNamePanel.setVisible(false);
           FNPanel.setVisible(false);
           MNPanel.setVisible(false);
           QPanel.setVisible(false);
           DOBPannel.setVisible(false);
           GPanel.setVisible(false);
           SNPanel.setVisible(false);
           PNPanel.setVisible(false);
           MPanel.setVisible(false);
           ADDPanel.setVisible(false);
           CPanel.setVisible(false);
           ABPanel.setVisible(false);     
           Adharnumberpanel.setVisible(false);
           PaymentPanel.setVisible(false);
           ShowBill1.setVisible(false);
           SaveButton.setVisible(false);
    
    }
    
      private void DisplayTable(){
         try{
           
                   String sql="SELECT  * FROM Registrationtable  WHERE administrationnumber="+AdministrationNumber.getText();
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
     
      
       private void  FirstName(){
        
           try{
                
                String sql="UPDATE Registrationtable SET Firstname=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,getfirstname.getText());
           
            pst.executeUpdate();
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
       
              private void  LastName(){
               
               
                try{
           
                String sql="UPDATE Registrationtable SET Lastname=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,getLastname.getText());
           
            pst.executeUpdate();
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
                private void  FatherName(){
                  
                   
                     try{
           
                String sql="UPDATE Registrationtable SET Fathername=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,FatherName.getText());
           
            pst.executeUpdate();
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
                private void MotherName(){
                   
                     
                     try{
           
                String sql="UPDATE Registrationtable SET Mothername=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, MotherName.getText());
           
            pst.executeUpdate();
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
          
                }
                 private void  Dob(){
                      SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                      String DOB=  ((JTextField)Dob.getDateEditor().getUiComponent()).getText();
                      try{
           
                String sql="UPDATE Registrationtable SET Dob=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,DOB);
           
            pst.executeUpdate();
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
                   private void  Gender(){
                         String Gender=null;
                 if(MaleRadioButton.isSelected()){
            Gender="Male";
        }if(FemaleRadioButton.isSelected()){
            Gender="Female";
        } if(OtherGenderRadioButton.isSelected()){
            Gender="Other";
        }
                     try{
           
                String sql="UPDATE Registrationtable SET Gender=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,Gender);
           
            pst.executeUpdate();
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
                  private void Qualification(){
                      
                         try{
           
                String sql="UPDATE Registrationtable SET Degree=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,Qualification.getText());
           
            pst.executeUpdate();
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
                   private void  StaffNumber(){
                       try{
           
                String sql="UPDATE Registrationtable SET Staffnumber=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setInt(1, Integer.valueOf(StaffNumber.getText()));
           
            pst.executeUpdate();
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
                   private void ParentNumber(){
                          try{
           
                String sql="UPDATE Registrationtable SET Parentnumber=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                   pst.setInt(1, Integer.valueOf(ParentNumber.getText()));
           
            pst.executeUpdate();
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
                  private void MailId(){
                          try{
           
                String sql="UPDATE Registrationtable SET Mailid=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, MailID.getText());
           
            pst.executeUpdate();
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
                        private void  Address(){
                         try{
           
                String sql="UPDATE Registrationtable SET Address=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, Address.getText());
           
            pst.executeUpdate();
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
                  private void College(){
                         try{
           
                String sql="UPDATE Registrationtable SET College=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, College.getText());
           
            pst.executeUpdate();
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
                    private void Academybackground(){
                         try{
           
                String sql="UPDATE StaffDetails SET Registrationtable=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, Academybackground.getText());
           
            pst.executeUpdate();
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
                    private void AddharNumber(){
                              try{
           
                String sql="UPDATE Registrationtable SET Addharnumber=? WHERE administrationnumber="+AdministrationNumber.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, Addharnumber.getText());
           
            pst.executeUpdate();
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AdministrationNumber = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LoadButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowData = new javax.swing.JTable();
        updatePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EditComboBox = new javax.swing.JComboBox<>();
        SelectButton = new javax.swing.JButton();
        FirstNamePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        getfirstname = new javax.swing.JTextField();
        UpdateButton1 = new javax.swing.JButton();
        LasttNamePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        getLastname = new javax.swing.JTextField();
        UpdateButton2 = new javax.swing.JButton();
        FNPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        FatherName = new javax.swing.JTextField();
        UpdateButton3 = new javax.swing.JButton();
        QPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Qualification = new javax.swing.JTextField();
        UpdateButton7 = new javax.swing.JButton();
        DOBPannel = new javax.swing.JPanel();
        UpdateButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Dob = new com.toedter.calendar.JDateChooser();
        GPanel = new javax.swing.JPanel();
        UpdateButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        OtherGenderRadioButton = new javax.swing.JRadioButton();
        SNPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        StaffNumber = new javax.swing.JTextField();
        UpdateButton8 = new javax.swing.JButton();
        PNPanel = new javax.swing.JPanel();
        ParentNumber = new javax.swing.JTextField();
        UpdateButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        MPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        MailID = new javax.swing.JTextField();
        UpdateButton10 = new javax.swing.JButton();
        ADDPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        UpdateButton11 = new javax.swing.JButton();
        CPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        College = new javax.swing.JTextField();
        UpdateButton12 = new javax.swing.JButton();
        ABPanel = new javax.swing.JPanel();
        UpdateButton13 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Academybackground = new javax.swing.JTextField();
        Adharnumberpanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        Addharnumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        PaymentPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        CourseFees = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        AmountPaid = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        GST = new javax.swing.JTextField();
        Calculate2 = new javax.swing.JButton();
        ShowBill1 = new javax.swing.JScrollPane();
        ShowBill = new javax.swing.JTextArea();
        SaveButton = new javax.swing.JButton();
        MNPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MotherName = new javax.swing.JTextField();
        UpdateButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

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

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Adminstration Number");

        AdministrationNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AdministrationNumber.setText(" ");

        SearchButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(AdministrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AdministrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        LoadButton.setBackground(new java.awt.Color(255, 255, 255));
        LoadButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(ShowData);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        updatePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Select Update");

        EditComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EditComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FirstName", "LastName", "FatherName", "MotherName", "Dob ", "Gender", "Qualification", "StaffNumber", "ParentNumber", "MailId", "Address", "College", "Academybackground", "AddharNumber", "Payment", " " }));

        SelectButton.setBackground(new java.awt.Color(255, 255, 255));
        SelectButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SelectButton.setText("Select");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        FirstNamePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("FirstName");

        UpdateButton1.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton1.setText("Update");
        UpdateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FirstNamePanelLayout = new javax.swing.GroupLayout(FirstNamePanel);
        FirstNamePanel.setLayout(FirstNamePanelLayout);
        FirstNamePanelLayout.setHorizontalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstNamePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214)
                .addComponent(getfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton1)
                .addGap(34, 34, 34))
        );
        FirstNamePanelLayout.setVerticalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(getfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        LasttNamePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        UpdateButton2.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton2.setText("Update");
        UpdateButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LasttNamePanelLayout = new javax.swing.GroupLayout(LasttNamePanel);
        LasttNamePanel.setLayout(LasttNamePanelLayout);
        LasttNamePanelLayout.setHorizontalGroup(
            LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LasttNamePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addComponent(getLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        LasttNamePanelLayout.setVerticalGroup(
            LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LasttNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(getLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        FNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Father Name");

        FatherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton3.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton3.setText("Update");
        UpdateButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FNPanelLayout = new javax.swing.GroupLayout(FNPanel);
        FNPanel.setLayout(FNPanelLayout);
        FNPanelLayout.setHorizontalGroup(
            FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FNPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel6)
                .addGap(218, 218, 218)
                .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        FNPanelLayout.setVerticalGroup(
            FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FNPanelLayout.createSequentialGroup()
                .addGroup(FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FNPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FNPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        QPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Qualification");

        UpdateButton7.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton7.setText("Update");
        UpdateButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QPanelLayout = new javax.swing.GroupLayout(QPanel);
        QPanel.setLayout(QPanelLayout);
        QPanelLayout.setHorizontalGroup(
            QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addGap(193, 193, 193)
                .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        QPanelLayout.setVerticalGroup(
            QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QPanelLayout.createSequentialGroup()
                .addGroup(QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addGroup(QPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QPanelLayout.createSequentialGroup()
                                .addComponent(Qualification)
                                .addGap(10, 10, 10)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DOBPannel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton5.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton5.setText("Update");
        UpdateButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Date Of Birth");

        Dob.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout DOBPannelLayout = new javax.swing.GroupLayout(DOBPannel);
        DOBPannel.setLayout(DOBPannelLayout);
        DOBPannelLayout.setHorizontalGroup(
            DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOBPannelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        DOBPannelLayout.setVerticalGroup(
            DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOBPannelLayout.createSequentialGroup()
                .addGroup(DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DOBPannelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DOBPannelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        GPanel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton6.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton6.setText("Update");
        UpdateButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Gender");

        MaleRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        MaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        FemaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        OtherGenderRadioButton.setBackground(new java.awt.Color(51, 153, 255));
        OtherGenderRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        OtherGenderRadioButton.setText("Other");
        OtherGenderRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherGenderRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GPanelLayout = new javax.swing.GroupLayout(GPanel);
        GPanel.setLayout(GPanelLayout);
        GPanelLayout.setHorizontalGroup(
            GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel10)
                .addGap(226, 226, 226)
                .addComponent(MaleRadioButton)
                .addGap(78, 78, 78)
                .addComponent(FemaleRadioButton)
                .addGap(68, 68, 68)
                .addComponent(OtherGenderRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        GPanelLayout.setVerticalGroup(
            GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GPanelLayout.createSequentialGroup()
                .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OtherGenderRadioButton))
                            .addComponent(jLabel10)))
                    .addGroup(GPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaleRadioButton)
                            .addComponent(FemaleRadioButton))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        SNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Staff Number");

        StaffNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton8.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton8.setText("Update");
        UpdateButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SNPanelLayout = new javax.swing.GroupLayout(SNPanel);
        SNPanel.setLayout(SNPanelLayout);
        SNPanelLayout.setHorizontalGroup(
            SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SNPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel11)
                .addGap(220, 220, 220)
                .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        SNPanelLayout.setVerticalGroup(
            SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SNPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PNPanel.setBackground(new java.awt.Color(51, 153, 255));

        ParentNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton9.setText("Update");
        UpdateButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton9ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Parent Number");

        javax.swing.GroupLayout PNPanelLayout = new javax.swing.GroupLayout(PNPanel);
        PNPanel.setLayout(PNPanelLayout);
        PNPanelLayout.setHorizontalGroup(
            PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addGap(216, 216, 216)
                .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PNPanelLayout.setVerticalGroup(
            PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        MPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Mail ID");

        MailID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton10.setText("Update");
        UpdateButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MPanelLayout = new javax.swing.GroupLayout(MPanel);
        MPanel.setLayout(MPanelLayout);
        MPanelLayout.setHorizontalGroup(
            MPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel13)
                .addGap(294, 294, 294)
                .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        MPanelLayout.setVerticalGroup(
            MPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(MPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(MPanelLayout.createSequentialGroup()
                .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ADDPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Address");

        UpdateButton11.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton11.setText("Update");
        UpdateButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADDPanelLayout = new javax.swing.GroupLayout(ADDPanel);
        ADDPanel.setLayout(ADDPanelLayout);
        ADDPanelLayout.setHorizontalGroup(
            ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel14)
                .addGap(270, 270, 270)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        ADDPanelLayout.setVerticalGroup(
            ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDPanelLayout.createSequentialGroup()
                .addGroup(ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14))
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(UpdateButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        CPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("College");

        College.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton12.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton12.setText("Update");
        UpdateButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CPanelLayout = new javax.swing.GroupLayout(CPanel);
        CPanel.setLayout(CPanelLayout);
        CPanelLayout.setHorizontalGroup(
            CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel15)
                .addGap(284, 284, 284)
                .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(UpdateButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CPanelLayout.setVerticalGroup(
            CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton12))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        ABPanel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton13.setText("Update");
        UpdateButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton13ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Academybackground");

        Academybackground.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout ABPanelLayout = new javax.swing.GroupLayout(ABPanel);
        ABPanel.setLayout(ABPanelLayout);
        ABPanelLayout.setHorizontalGroup(
            ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(UpdateButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        ABPanelLayout.setVerticalGroup(
            ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(UpdateButton13)
                .addGap(21, 21, 21))
            .addGroup(ABPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Adharnumberpanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Addhar Number");

        Addharnumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Update");

        javax.swing.GroupLayout AdharnumberpanelLayout = new javax.swing.GroupLayout(Adharnumberpanel);
        Adharnumberpanel.setLayout(AdharnumberpanelLayout);
        AdharnumberpanelLayout.setHorizontalGroup(
            AdharnumberpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdharnumberpanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel18)
                .addGap(194, 194, 194)
                .addComponent(Addharnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        AdharnumberpanelLayout.setVerticalGroup(
            AdharnumberpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdharnumberpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AdharnumberpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addharnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdharnumberpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AdharnumberpanelLayout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(6, 6, 6))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PaymentPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel38.setText("Regestration Fees");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel39.setText("200");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel41.setText("Course Fees");

        CourseFees.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CourseFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseFeesActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel42.setText("Amount Paid");

        AmountPaid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        AmountPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountPaidActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel43.setText("GST");

        GST.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        GST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GSTActionPerformed(evt);
            }
        });

        Calculate2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Calculate2.setText("Calculate");
        Calculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaymentPanelLayout = new javax.swing.GroupLayout(PaymentPanel);
        PaymentPanel.setLayout(PaymentPanelLayout);
        PaymentPanelLayout.setHorizontalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PaymentPanelLayout.createSequentialGroup()
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addGap(186, 186, 186)
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addComponent(CourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel43))
                            .addComponent(AmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaymentPanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Calculate2)
                                .addGap(176, 176, 176))))))
        );
        PaymentPanelLayout.setVerticalGroup(
            PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaymentPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(CourseFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(GST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(PaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(Calculate2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        ShowBill.setEditable(false);
        ShowBill.setColumns(20);
        ShowBill.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ShowBill.setRows(5);
        ShowBill1.setViewportView(ShowBill);

        SaveButton.setBackground(new java.awt.Color(255, 255, 255));
        SaveButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        MNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mother Name");

        MotherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton4.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton4.setText("Update");
        UpdateButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MNPanelLayout = new javax.swing.GroupLayout(MNPanel);
        MNPanel.setLayout(MNPanelLayout);
        MNPanelLayout.setHorizontalGroup(
            MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MNPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addGap(206, 206, 206)
                .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        MNPanelLayout.setVerticalGroup(
            MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MNPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(498, 498, 498))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Adharnumberpanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ABPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADDPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LasttNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DOBPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ShowBill1))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LasttNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOBPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ABPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Adharnumberpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowBill1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AdminStudentDataView sdeav=new AdminStudentDataView();
        sdeav.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // Show the data of student
        DisplayTable();
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        updatePanel.setVisible(true);
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed
        // TODO add your handling code here:
        String Selected=(String) EditComboBox.getSelectedItem();

        if(Selected=="FirstName"){
            FirstNamePanel.setVisible(true);
        }
        if(Selected=="LastName"){
            LasttNamePanel.setVisible(true);
        }
        if(Selected=="FatherName"){

            FNPanel.setVisible(true);

        }
        if(Selected=="MotherName"){
            MNPanel.setVisible(true);

        }
        if(Selected=="Dob "){
            DOBPannel.setVisible(true);

        }
        if(Selected=="Gender"){
            GPanel.setVisible(true);
        }
        if(Selected=="Qualification"){
            QPanel.setVisible(true);
        }
        if(Selected=="StaffNumber"){
            SNPanel.setVisible(true);

        }
        if(Selected=="ParentNumber"){
            PNPanel.setVisible(true);

        }
        if(Selected=="MailId"){
            MPanel.setVisible(true);

        }
        if(Selected=="Address"){
            ADDPanel.setVisible(true);

        }
        if(Selected=="College"){
            CPanel.setVisible(true);

        }
        if(Selected=="Academybackground"){
            ABPanel.setVisible(true);
        }
        if(Selected=="AddharNumber"){
            Adharnumberpanel.setVisible(true);

        }
        if(Selected=="Payment"){
            
           PaymentPanel.setVisible(true);
        }
    }//GEN-LAST:event_SelectButtonActionPerformed

    private void UpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton1ActionPerformed
        FirstName();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton1ActionPerformed

    private void UpdateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton2ActionPerformed
        // TODO add your handling code here:
        LastName();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton2ActionPerformed

    private void UpdateButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton3ActionPerformed
        // TODO add your handling code here:
        FatherName();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton3ActionPerformed

    private void UpdateButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton4ActionPerformed
        // TODO add your handling code here:
        MotherName();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton4ActionPerformed

    private void UpdateButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton7ActionPerformed
        // TODO add your handling code here:

        Qualification();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton7ActionPerformed

    private void UpdateButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton5ActionPerformed
        // TODO add your handling code here:
        Dob();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton5ActionPerformed

    private void UpdateButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton6ActionPerformed
        // TODO add your handling code here:
        Gender();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton6ActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(MaleRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(FemaleRadioButton.isSelected()){
            MaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);

        }
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void OtherGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherGenderRadioButtonActionPerformed
        // TODO add your handling code here:
        if(OtherGenderRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            MaleRadioButton.setSelected(false);

        }
    }//GEN-LAST:event_OtherGenderRadioButtonActionPerformed

    private void UpdateButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton8ActionPerformed
        // TODO add your handling code here
        StaffNumber();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton8ActionPerformed

    private void UpdateButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton9ActionPerformed
        // TODO add your handling code here:
        ParentNumber();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton9ActionPerformed

    private void UpdateButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton10ActionPerformed
        // TODO add your handling code here:
        MailId();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton10ActionPerformed

    private void UpdateButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton11ActionPerformed
        // TODO add your handling code here:
        Address();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton11ActionPerformed

    private void UpdateButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton12ActionPerformed
        // TODO add your handling code here:
        College();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton12ActionPerformed

    private void UpdateButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton13ActionPerformed
        // TODO add your handling code here:
        Academybackground();
        JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_UpdateButton13ActionPerformed

    private void CourseFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseFeesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CourseFeesActionPerformed

    private void AmountPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountPaidActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AmountPaidActionPerformed

    private void GSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSTActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_GSTActionPerformed

    private void Calculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate2ActionPerformed
        // Calculation for the fees
         ShowBill1.setVisible(true);
          SaveButton.setVisible(true);
        Coursefees=Integer.valueOf(CourseFees.getText());
        Gst=Integer.valueOf(GST.getText());
        Amountpaid=Integer.valueOf(AmountPaid.getText());

        int Gstamount=Coursefees*Gst/100;
        totalcoursefees=Coursefees+Gstamount;
        Balanceamount=totalcoursefees-Amountpaid;
        ShowBill.setText("                             My First Step Computer Skill"
            +"\n Course Fees                                                         "+String.valueOf(Coursefees)
            +"\n GST%                                        "+Gst+"%                  "+String.valueOf(Gstamount)
            +"\n Total Course Fees                                                "+String.valueOf(totalcoursefees)
            +"\n Fess Paid                                                            "+String.valueOf(Amountpaid)
            +"\n Balance to pay                                                     "+String.valueOf(Balanceamount));
        
            
                     
              
                              
    }//GEN-LAST:event_Calculate2ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        
          try{
                   String sql="UPDATE Registrationtable SET Coursefees=?,Gst=?,Amountpaid=?,totalfees=?,Balanceamount=?  WHERE administrationnumber="+AdministrationNumber.getText();
                   pst =con.prepareStatement(sql);
                           
                            pst.setInt(1, Coursefees);   ///24
                             pst.setInt(2, Gst);  //25 
                              pst.setInt(3,  Amountpaid);   //26
                               pst.setInt(4,totalcoursefees );  //27
                               pst.setInt(5, Balanceamount);  //28
                              
                                
                                
                         pst.execute();
                         
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
          JOptionPane.showMessageDialog(this,"Updated");
    }//GEN-LAST:event_SaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminStudentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminStudentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminStudentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminStudentdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStudentdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABPanel;
    private javax.swing.JPanel ADDPanel;
    private javax.swing.JTextField Academybackground;
    private javax.swing.JTextField Addharnumber;
    private javax.swing.JTextField Address;
    private javax.swing.JPanel Adharnumberpanel;
    private javax.swing.JTextField AdministrationNumber;
    private javax.swing.JTextField AmountPaid;
    private javax.swing.JPanel CPanel;
    private javax.swing.JButton Calculate2;
    private javax.swing.JTextField College;
    private javax.swing.JTextField CourseFees;
    private javax.swing.JPanel DOBPannel;
    private com.toedter.calendar.JDateChooser Dob;
    private javax.swing.JComboBox<String> EditComboBox;
    private javax.swing.JPanel FNPanel;
    private javax.swing.JTextField FatherName;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JPanel FirstNamePanel;
    private javax.swing.JPanel GPanel;
    private javax.swing.JTextField GST;
    private javax.swing.JPanel LasttNamePanel;
    private javax.swing.JButton LoadButton;
    private javax.swing.JPanel MNPanel;
    private javax.swing.JPanel MPanel;
    private javax.swing.JTextField MailID;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JTextField MotherName;
    private javax.swing.JRadioButton OtherGenderRadioButton;
    private javax.swing.JPanel PNPanel;
    private javax.swing.JTextField ParentNumber;
    private javax.swing.JPanel PaymentPanel;
    private javax.swing.JPanel QPanel;
    private javax.swing.JTextField Qualification;
    private javax.swing.JPanel SNPanel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SelectButton;
    private javax.swing.JTextArea ShowBill;
    private javax.swing.JScrollPane ShowBill1;
    private javax.swing.JTable ShowData;
    private javax.swing.JTextField StaffNumber;
    private javax.swing.JButton UpdateButton1;
    private javax.swing.JButton UpdateButton10;
    private javax.swing.JButton UpdateButton11;
    private javax.swing.JButton UpdateButton12;
    private javax.swing.JButton UpdateButton13;
    private javax.swing.JButton UpdateButton2;
    private javax.swing.JButton UpdateButton3;
    private javax.swing.JButton UpdateButton4;
    private javax.swing.JButton UpdateButton5;
    private javax.swing.JButton UpdateButton6;
    private javax.swing.JButton UpdateButton7;
    private javax.swing.JButton UpdateButton8;
    private javax.swing.JButton UpdateButton9;
    private javax.swing.JTextField getLastname;
    private javax.swing.JTextField getfirstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}

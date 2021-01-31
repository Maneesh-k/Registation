/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ELCOT
 */
public class EditStaffdata extends javax.swing.JFrame {

    /**
     * Creates new form EditStaffdata
     */
    
      Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public EditStaffdata() {
        initComponents();
         con=ConnectionDb.DbConnection();
           updatePanel.setVisible(false);
           EditComboBox.setSelectedItem(null);
          
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
           JDPanel.setVisible(false);   
          LeaveButton.setVisible(false);   
           
   }

    
    private void DisplayTable(){
         try{
           
                   String sql="SELECT  * FROM StaffDetails  WHERE Staffid="+Staffid.getText();
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
                
                String sql="UPDATE StaffDetails SET Firstname=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Lastname=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Fathername=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Mothername=? WHERE Staffid="+Staffid.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1, MotherName.getText());
           
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
                 private void  Dob(){
                      SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                      String Dob= SDF.format(DOB.getValue());
                      try{
           
                String sql="UPDATE StaffDetails SET Dob=? WHERE Staffid="+Staffid.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,Dob);
           
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
           
                String sql="UPDATE StaffDetails SET Gender=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Degree=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Staffnumber=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Parentnumber=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Mailid=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Address=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET College=? WHERE Staffid="+Staffid.getText();
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
           
                String sql="UPDATE StaffDetails SET Academybackground=? WHERE Staffid="+Staffid.getText();
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
                  private void JoinDate(){
                       SimpleDateFormat SDF=new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                      String Joint= SDF.format(JoinDate.getValue());
                      try{
           
                String sql="UPDATE StaffDetails SET dateofjoin=? WHERE Staffid="+Staffid.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,Joint);
           
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
                   private void LeaveDate(){
                       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                  String dateTime= String.valueOf(formatter.format(date));
                    try{
           
                String sql="UPDATE StaffDetails SET dateofleave=? WHERE Staffid="+Staffid.getText();
                pst =con.prepareStatement(sql);
                pst.setString(1,dateTime);
           
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
                    
                       try{
          
                String sql="DELETE FROM StaffLogintable WHERE Id ="+Staffid.getText();
                pst =con.prepareStatement(sql);
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
                       

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Staffid = new javax.swing.JTextField();
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
        MNPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        MotherName = new javax.swing.JTextField();
        UpdateButton4 = new javax.swing.JButton();
        QPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Qualification = new javax.swing.JTextField();
        UpdateButton7 = new javax.swing.JButton();
        DOBPannel = new javax.swing.JPanel();
        UpdateButton5 = new javax.swing.JButton();
        DOB = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
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
        JDPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        JoinDate = new javax.swing.JSpinner();
        UpdateButton14 = new javax.swing.JButton();
        LeaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setText("Staff Data");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Staff Id Number");

        Staffid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Staffid.setText(" ");

        SearchButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(SearchButton)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        LoadButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoadButton)
                .addContainerGap())
        );

        jLabel3.setText("Select Update");

        EditComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FirstName", "LastName", "FatherName", "MotherName", "Dob ", "Gender", "Qualification", "StaffNumber", "ParentNumber", "MailId", "Address", "College", "Academybackground", "JoinDate", "LeaveDate", " " }));

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
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(81, 81, 81)
                .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel4.setText("FirstName");

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
                .addGap(56, 56, 56)
                .addComponent(getfirstname)
                .addGap(57, 57, 57)
                .addComponent(UpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        FirstNamePanelLayout.setVerticalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(getfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel5.setText("Last Name");

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
                .addGap(56, 56, 56)
                .addComponent(getLastname)
                .addGap(45, 45, 45)
                .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        LasttNamePanelLayout.setVerticalGroup(
            LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LasttNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(getLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel6.setText("Father Name");

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
                .addGap(111, 111, 111)
                .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        FNPanelLayout.setVerticalGroup(
            FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FNPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel7.setText("Mother Name");

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
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(118, 118, 118)
                .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MNPanelLayout.setVerticalGroup(
            MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MNPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(21, 21, 21))
        );

        jLabel8.setText("Qualification");

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
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(116, 116, 116)
                .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        QPanelLayout.setVerticalGroup(
            QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        UpdateButton5.setText("Update");
        UpdateButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton5ActionPerformed(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DOB.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(-631171800000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        DOB.setEditor(new javax.swing.JSpinner.DateEditor(DOB, "yyyy-MM-dd"));
        DOB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DOBAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Date Of Birth");

        javax.swing.GroupLayout DOBPannelLayout = new javax.swing.GroupLayout(DOBPannel);
        DOBPannel.setLayout(DOBPannelLayout);
        DOBPannelLayout.setHorizontalGroup(
            DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DOBPannelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        DOBPannelLayout.setVerticalGroup(
            DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOBPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        UpdateButton6.setText("Update");
        UpdateButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton6ActionPerformed(evt);
            }
        });

        jLabel10.setText("Gender");

        MaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MaleRadioButton.setText("Male");
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        FemaleRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

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
                .addGap(55, 55, 55)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MaleRadioButton)
                .addGap(28, 28, 28)
                .addComponent(FemaleRadioButton)
                .addGap(39, 39, 39)
                .addComponent(OtherGenderRadioButton)
                .addGap(97, 97, 97)
                .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        GPanelLayout.setVerticalGroup(
            GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPanelLayout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FemaleRadioButton)
                    .addComponent(MaleRadioButton)
                    .addComponent(OtherGenderRadioButton)
                    .addComponent(jLabel10)
                    .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jLabel11.setText("Staff Number");

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
                .addGap(119, 119, 119)
                .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        SNPanelLayout.setVerticalGroup(
            SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SNPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        UpdateButton9.setText("Update");
        UpdateButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton9ActionPerformed(evt);
            }
        });

        jLabel12.setText("Parent Number");

        javax.swing.GroupLayout PNPanelLayout = new javax.swing.GroupLayout(PNPanel);
        PNPanel.setLayout(PNPanelLayout);
        PNPanelLayout.setHorizontalGroup(
            PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PNPanelLayout.setVerticalGroup(
            PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel13.setText("Mail ID");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        MPanelLayout.setVerticalGroup(
            MPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(37, 37, 37))
            .addGroup(MPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(MPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel14.setText("Address");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(UpdateButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        ADDPanelLayout.setVerticalGroup(
            ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDPanelLayout.createSequentialGroup()
                .addGroup(ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14))
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel15.setText("College");

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
                .addGap(28, 28, 28)
                .addComponent(jLabel15)
                .addGap(175, 175, 175)
                .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        CPanelLayout.setVerticalGroup(
            CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        UpdateButton13.setText("Update");
        UpdateButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton13ActionPerformed(evt);
            }
        });

        jLabel16.setText("Academybackground");

        javax.swing.GroupLayout ABPanelLayout = new javax.swing.GroupLayout(ABPanel);
        ABPanel.setLayout(ABPanelLayout);
        ABPanelLayout.setHorizontalGroup(
            ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(UpdateButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        ABPanelLayout.setVerticalGroup(
            ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel17.setText("Join Date");

        JoinDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JoinDate.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(-631171800000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        JoinDate.setEditor(new javax.swing.JSpinner.DateEditor(JoinDate, "yyyy-MM-dd"));
        JoinDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JoinDateAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        UpdateButton14.setText("Update");
        UpdateButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JDPanelLayout = new javax.swing.GroupLayout(JDPanel);
        JDPanel.setLayout(JDPanelLayout);
        JDPanelLayout.setHorizontalGroup(
            JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JDPanelLayout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(JoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(280, Short.MAX_VALUE)))
        );
        JDPanelLayout.setVerticalGroup(
            JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(UpdateButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JDPanelLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(JoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        LeaveButton.setText("Leave");
        LeaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LasttNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DOBPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ABPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(LeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(FirstNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LasttNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FNPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MNPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DOBPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(GPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(QPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(SNPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PNPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ADDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ABPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveButtonActionPerformed
        LeaveDate();
       JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_LeaveButtonActionPerformed

    private void UpdateButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton14ActionPerformed
        // TODO add your handling code here:
        JoinDate();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton14ActionPerformed

    private void JoinDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JoinDateAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_JoinDateAncestorAdded

    private void UpdateButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton13ActionPerformed
        // TODO add your handling code here:
        Academybackground();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton13ActionPerformed

    private void UpdateButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton12ActionPerformed
        // TODO add your handling code here:
        College();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton12ActionPerformed

    private void UpdateButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton11ActionPerformed
        // TODO add your handling code here:
        Address();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton11ActionPerformed

    private void UpdateButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton10ActionPerformed
        // TODO add your handling code here:
        MailId();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton10ActionPerformed

    private void UpdateButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton9ActionPerformed
        // TODO add your handling code here:
        ParentNumber();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton9ActionPerformed

    private void UpdateButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton8ActionPerformed
        // TODO add your handling code here
        StaffNumber();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton8ActionPerformed

    private void OtherGenderRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherGenderRadioButtonActionPerformed
        // TODO add your handling code here:
        if(OtherGenderRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            MaleRadioButton.setSelected(false);

        }
    }//GEN-LAST:event_OtherGenderRadioButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(FemaleRadioButton.isSelected()){
            MaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);

        }
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(MaleRadioButton.isSelected()){
            FemaleRadioButton.setSelected(false);
            OtherGenderRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void UpdateButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton6ActionPerformed
        // TODO add your handling code here:
        Gender();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton6ActionPerformed

    private void DOBAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DOBAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBAncestorAdded

    private void UpdateButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton5ActionPerformed
        // TODO add your handling code here:
        Dob();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton5ActionPerformed

    private void UpdateButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton7ActionPerformed
        // TODO add your handling code here:

        Qualification();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton7ActionPerformed

    private void UpdateButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton4ActionPerformed
        // TODO add your handling code here:
        MotherName();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton4ActionPerformed

    private void UpdateButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton3ActionPerformed
        // TODO add your handling code here:
        FatherName();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton3ActionPerformed

    private void UpdateButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton2ActionPerformed
        // TODO add your handling code here:
        LastName();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton2ActionPerformed

    private void UpdateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButton1ActionPerformed
        FirstName();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_UpdateButton1ActionPerformed

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
        if(Selected=="JoinDate"){
            JDPanel.setVisible(true);

        }
        if(Selected=="LeaveDate"){
            LeaveButton.setVisible(true);
        }

    }//GEN-LAST:event_SelectButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        // TODO add your handling code here:
        updatePanel.setVisible(true);
    }//GEN-LAST:event_LoadButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // Show the data of student
        DisplayTable();
         JOptionPane.showMessageDialog(this,"Updated");  
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        StaffDetails staff=new StaffDetails();
        staff.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditStaffdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ABPanel;
    private javax.swing.JPanel ADDPanel;
    private javax.swing.JTextField Academybackground;
    private javax.swing.JTextField Address;
    private javax.swing.JPanel CPanel;
    private javax.swing.JTextField College;
    private javax.swing.JSpinner DOB;
    private javax.swing.JPanel DOBPannel;
    private javax.swing.JComboBox<String> EditComboBox;
    private javax.swing.JPanel FNPanel;
    private javax.swing.JTextField FatherName;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JPanel FirstNamePanel;
    private javax.swing.JPanel GPanel;
    private javax.swing.JPanel JDPanel;
    private javax.swing.JSpinner JoinDate;
    private javax.swing.JPanel LasttNamePanel;
    private javax.swing.JButton LeaveButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JPanel MNPanel;
    private javax.swing.JPanel MPanel;
    private javax.swing.JTextField MailID;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JTextField MotherName;
    private javax.swing.JRadioButton OtherGenderRadioButton;
    private javax.swing.JPanel PNPanel;
    private javax.swing.JTextField ParentNumber;
    private javax.swing.JPanel QPanel;
    private javax.swing.JTextField Qualification;
    private javax.swing.JPanel SNPanel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SelectButton;
    private javax.swing.JTable ShowData;
    private javax.swing.JTextField StaffNumber;
    private javax.swing.JTextField Staffid;
    private javax.swing.JButton UpdateButton1;
    private javax.swing.JButton UpdateButton10;
    private javax.swing.JButton UpdateButton11;
    private javax.swing.JButton UpdateButton12;
    private javax.swing.JButton UpdateButton13;
    private javax.swing.JButton UpdateButton14;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}

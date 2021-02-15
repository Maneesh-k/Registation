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
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ELCOT
 */
public class AdminEditStaffdata extends javax.swing.JFrame {

    /**
     * Creates new form AdminEditStaffdata
     */
    
      Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
     ImageIcon icon;
     
    public AdminEditStaffdata() {
        initComponents();
         con=ConnectionDb.DbConnection();
           updatePanel.setVisible(false);
           EditComboBox.setSelectedItem(null);
           
            icon= new ImageIcon("D:\\Regestation form\\Software\\Logo (2).png");
        setIconImage(icon.getImage());
          
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
                     
                      String DOB=  ((JTextField)Dob.getDateEditor().getUiComponent()).getText();
                      try{
           
                String sql="UPDATE StaffDetails SET Dob=? WHERE Staffid="+Staffid.getText();
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
                       
                      String Joint= ((JTextField)JoinDate.getDateEditor().getUiComponent()).getText();
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
            System.out.println("Successfully updated the Leave daet in database");
            }catch(SQLException e){
                System.out.println("fail to update the Leave date in database"+e);
             }finally{
                try{
                    
                    pst.close();
                    System.out.println("Successfully colsed the data base");
                }catch(SQLException e){
                    System.out.println("Fail to close the database"+e);
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
        JDPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        UpdateButton14 = new javax.swing.JButton();
        JoinDate = new com.toedter.calendar.JDateChooser();
        LeaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Staff Data");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Staff Id Number");

        Staffid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Staffid.setText(" ");

        SearchButton.setBackground(new java.awt.Color(255, 255, 255));
        SearchButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(69, 69, 69)
                .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        LoadButton.setBackground(new java.awt.Color(255, 255, 255));
        LoadButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LoadButton.setText("Load");
        LoadButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        ShowData.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        updatePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Select Update");

        EditComboBox.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        EditComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FirstName", "LastName", "FatherName", "MotherName", "Dob ", "Gender", "Qualification", "StaffNumber", "ParentNumber", "MailId", "Address", "College", "Academybackground", "JoinDate", "LeaveDate", " " }));

        SelectButton.setBackground(new java.awt.Color(255, 255, 255));
        SelectButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SelectButton.setText("Select");
        SelectButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SelectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SelectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
        );

        FirstNamePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("FirstName");

        getfirstname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton1.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton1.setText("Update");
        UpdateButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(146, 146, 146)
                .addComponent(getfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        FirstNamePanelLayout.setVerticalGroup(
            FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FirstNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(getfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        LasttNamePanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Last Name");

        getLastname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton2.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton2.setText("Update");
        UpdateButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(142, 142, 142)
                .addComponent(getLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        LasttNamePanelLayout.setVerticalGroup(
            LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LasttNamePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(LasttNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(getLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        FNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Father Name");

        FatherName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton3.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton3.setText("Update");
        UpdateButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        FNPanelLayout.setVerticalGroup(
            FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FNPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(FNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        MNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mother Name");

        UpdateButton4.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton4.setText("Update");
        UpdateButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(157, 157, 157)
                .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        MNPanelLayout.setVerticalGroup(
            MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MNPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(MNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotherName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30))
        );

        QPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Qualification");

        Qualification.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton7.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton7.setText("Update");
        UpdateButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(56, 56, 56)
                .addComponent(jLabel8)
                .addGap(175, 175, 175)
                .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        QPanelLayout.setVerticalGroup(
            QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(QPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(UpdateButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        DOBPannel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton5.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton5.setText("Update");
        UpdateButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DOBPannelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        DOBPannelLayout.setVerticalGroup(
            DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DOBPannelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DOBPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UpdateButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Dob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        GPanel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton6.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton6.setText("Update");
        UpdateButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141)
                .addComponent(MaleRadioButton)
                .addGap(50, 50, 50)
                .addComponent(FemaleRadioButton)
                .addGap(57, 57, 57)
                .addComponent(OtherGenderRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        GPanelLayout.setVerticalGroup(
            GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPanelLayout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addGroup(GPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FemaleRadioButton)
                    .addComponent(MaleRadioButton)
                    .addComponent(OtherGenderRadioButton)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        SNPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Staff Number");

        StaffNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton8.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton8.setText("Update");
        UpdateButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(63, 63, 63)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        SNPanelLayout.setVerticalGroup(
            SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SNPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(SNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(StaffNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PNPanel.setBackground(new java.awt.Color(51, 153, 255));

        ParentNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton9.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton9.setText("Update");
        UpdateButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(172, 172, 172)
                .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        PNPanelLayout.setVerticalGroup(
            PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PNPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ParentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        MPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Mail ID");

        MailID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton10.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton10.setText("Update");
        UpdateButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
                    .addComponent(UpdateButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MailID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        ADDPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Address");

        Address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton11.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton11.setText("Update");
        UpdateButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(57, 57, 57)
                .addComponent(jLabel14)
                .addGap(225, 225, 225)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        ADDPanelLayout.setVerticalGroup(
            ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADDPanelLayout.createSequentialGroup()
                .addGroup(ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(ADDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ADDPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(UpdateButton11)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        CPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("College");

        College.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        UpdateButton12.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton12.setText("Update");
        UpdateButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(266, 266, 266)
                .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UpdateButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        CPanelLayout.setVerticalGroup(
            CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(College, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        ABPanel.setBackground(new java.awt.Color(51, 153, 255));

        UpdateButton13.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton13.setText("Update");
        UpdateButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(UpdateButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        ABPanelLayout.setVerticalGroup(
            ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ABPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(Academybackground, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        JDPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Join Date");

        UpdateButton14.setBackground(new java.awt.Color(255, 255, 255));
        UpdateButton14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        UpdateButton14.setText("Update");
        UpdateButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UpdateButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButton14ActionPerformed(evt);
            }
        });

        JoinDate.setDateFormatString("dd-MMM-yyyy");

        javax.swing.GroupLayout JDPanelLayout = new javax.swing.GroupLayout(JDPanel);
        JDPanel.setLayout(JDPanelLayout);
        JDPanelLayout.setHorizontalGroup(
            JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(UpdateButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        JDPanelLayout.setVerticalGroup(
            JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(UpdateButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        LeaveButton.setBackground(new java.awt.Color(255, 255, 255));
        LeaveButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LeaveButton.setText("Leave");
        LeaveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(352, 352, 352))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ABPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LasttNamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DOBPannel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PNPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ADDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(521, 521, 521)
                .addComponent(LeaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(320, 320, 320))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(FirstNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LasttNamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(MNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(DOBPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(GPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(QPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(SNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(PNPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23)
                .addComponent(MPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ADDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(ABPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LeaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
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

        if("FirstName".equals(Selected)){
            FirstNamePanel.setVisible(true);
        }
        if("LastName".equals(Selected)){
            LasttNamePanel.setVisible(true);
        }
        if("FatherName".equals(Selected)){

            FNPanel.setVisible(true);

        }
        if("MotherName".equals(Selected)){
            MNPanel.setVisible(true);

        }
        if("Dob ".equals(Selected)){
            DOBPannel.setVisible(true);

        }
        if("Gender".equals(Selected)){
            GPanel.setVisible(true);
        }
        if("Qualification".equals(Selected)){
            QPanel.setVisible(true);
        }
        if("StaffNumber".equals(Selected)){
            SNPanel.setVisible(true);

        }
        if("ParentNumber".equals(Selected)){
            PNPanel.setVisible(true);

        }
        if("MailId".equals(Selected)){
            MPanel.setVisible(true);

        }
        if("Address".equals(Selected)){
            ADDPanel.setVisible(true);

        }
        if("College".equals(Selected)){
            CPanel.setVisible(true);

        }
        if("Academybackground".equals(Selected)){
            ABPanel.setVisible(true);
        }
        if("JoinDate".equals(Selected)){
            JDPanel.setVisible(true);

        }
        if("LeaveDate".equals(Selected)){
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
         
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AdminStaffDetails staff=new AdminStaffDetails();
        staff.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(AdminEditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditStaffdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEditStaffdata().setVisible(true);
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
    private javax.swing.JPanel DOBPannel;
    private com.toedter.calendar.JDateChooser Dob;
    private javax.swing.JComboBox<String> EditComboBox;
    private javax.swing.JPanel FNPanel;
    private javax.swing.JTextField FatherName;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JPanel FirstNamePanel;
    private javax.swing.JPanel GPanel;
    private javax.swing.JPanel JDPanel;
    private com.toedter.calendar.JDateChooser JoinDate;
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

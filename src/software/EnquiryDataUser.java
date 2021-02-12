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
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ELCOT
 */
public class EnquiryDataUser extends javax.swing.JFrame {

    /**
     * Creates new form EnquiryDataUser
     */
    
      Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    
    
    static String Searchby;
    static String getsearch;
    
    
    
    public EnquiryDataUser() {
        initComponents();
         con=ConnectionDb.DbConnection();
          DisplayTable();
          
          getDOB.setVisible(false);
         SearchButton2.setVisible(false);
    }

     private void DisplayTable(){
         try{
                   String sql="Select * FROM Enquriytable";
                   pst =con.prepareStatement(sql);
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("Successfully load enquirydata");
            }catch(Exception e){
                 System.out.println("Fail to load enquirydata"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully closed database");
                 }catch(Exception e){
                     System.out.println("Fail to lose database"+e);
                 }
             }
    }
     
     private void FirstNameSearchdispaly(){
         try{
           
                   String sql="SELECT  * FROM Enquriytable  WHERE Firstname=?";
                   pst =con.prepareStatement(sql);
                                                                                    //1
                   pst.setString(1, getsearch);                                                                  //2                   
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("Successfully searched the data");
            }catch(SQLException e){
                 System.out.println("Fail searched the data"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully closed database");
                 }catch(SQLException e){
                     System.out.println("Fail to lose database"+e);
                 }
             }
     }
     
     private void StudentNumberSearchdispaly(){
         try{
           
                   String sql="SELECT  * FROM Enquriytable  WHERE Studentnumber=?";
                   pst =con.prepareStatement(sql);
                                                                                    //1
                   pst.setString(1, getsearch);                                                                  //2                   
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("Successfully searched the data");
            }catch(SQLException e){
                 System.out.println("Fail searched the data"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully closed database");
                 }catch(SQLException e){
                     System.out.println("Fail to lose database"+e);
                 }
             }
     }
     private void FatherNameSearchdispaly(){
         try{
           
                   String sql="SELECT  * FROM Enquriytable  WHERE Fathername=?";
                   pst =con.prepareStatement(sql);
                                                                                    //1
                   pst.setString(1, getsearch);                                                                  //2                   
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("Successfully searched the data");
            }catch(SQLException e){
                 System.out.println("Fail searched the data"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully closed database");
                 }catch(SQLException e){
                     System.out.println("Fail to lose database"+e);
                 }
             }
     }
     
     private void DobSearchdispaly(){
         try{
           
                   String sql="SELECT  * FROM Enquriytable  WHERE Dob=?";
                   pst =con.prepareStatement(sql);
                   
                   pst.setString(1, getsearch);    
                   
                   rs=pst.executeQuery();
                   ShowData.setModel(DbUtils.resultSetToTableModel(rs));
                   ShowData.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                   
            
                    System.out.println("Successfully searched the data");
            }catch(SQLException e){
                 System.out.println("Fail searched the data"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully closed database");
                 }catch(SQLException e){
                     System.out.println("Fail to lose database"+e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        GetSearch = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        SearchComboBox = new javax.swing.JComboBox<>();
        getDOB = new com.toedter.calendar.JDateChooser();
        SearchButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Enquiry Student Details");

        GetSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetSearchActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        SearchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Firstname", "Fathername", "Dob", "Studennumber" }));

        getDOB.setDateFormatString("dd-MMM-yyyy");

        SearchButton2.setText("Search");
        SearchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(512, 512, 512)
                                .addComponent(SearchComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(GetSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GetSearch)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OptionForm optionform=new OptionForm();
       optionform.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GetSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetSearchActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
          
        ShowData.clearSelection();
        ShowData.removeAll();
        Searchby=SearchComboBox.getSelectedItem().toString();
        
        
        if("Firstname".equals(Searchby)){
        
        getDOB.setVisible(false);
        getsearch=GetSearch.getText();
        SearchButton2.setVisible(false);
        FirstNameSearchdispaly();
        }
        if("Fathername".equals(Searchby)){
        
        getDOB.setVisible(false);
        getsearch=GetSearch.getText();
        SearchButton2.setVisible(false);
        FatherNameSearchdispaly();
        }
        if("Studentnumber".equals(Searchby)){
        
        getDOB.setVisible(false);
        getsearch=GetSearch.getText();
        SearchButton2.setVisible(false);
        StudentNumberSearchdispaly();
        }
        if("Dob".equals(Searchby)){
        
        getDOB.setVisible(true);
        GetSearch.setVisible(false);
        SearchButton2.setVisible(true);
        }
      
     
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SearchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton2ActionPerformed
        // TODO add your handling code here:
        if("Firstname".equals(Searchby)){
        
        getDOB.setVisible(false);
        GetSearch.setVisible(true);
      SearchButton.setVisible(true);
        SearchButton2.setVisible(false);
        }
        if("Fathername".equals(Searchby)){
        
        getDOB.setVisible(false);
        GetSearch.setVisible(true);
      SearchButton.setVisible(true);
        SearchButton2.setVisible(false);
        }
        if("Studentnumber".equals(Searchby)){
        
        getDOB.setVisible(false);
        GetSearch.setVisible(true);
        SearchButton.setVisible(true);
        SearchButton2.setVisible(false);
        }
        if("Dob".equals(Searchby)){
        
        getDOB.setVisible(true);
        SearchButton.setVisible(false);
        
        getsearch=((JTextField)getDOB.getDateEditor().getUiComponent()).getText();
        DobSearchdispaly();
        }
        
        
    }//GEN-LAST:event_SearchButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EnquiryDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnquiryDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnquiryDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnquiryDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnquiryDataUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GetSearch;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SearchButton2;
    private javax.swing.JComboBox<String> SearchComboBox;
    private javax.swing.JTable ShowData;
    private com.toedter.calendar.JDateChooser getDOB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author ELCOT
 */
        
         //sqlite database connection   
   

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdministionNumberCount {
    
    
     Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static int administrationnumber;
    static int RegistrationMax ;
    static int EnquiryMax;
    
    
     AdministionNumberCount(){
         con=ConnectionDb.DbConnection(); 
         RegistrationMaxCount();
         EnquiryMaxcount();   
         
         if(RegistrationMax<EnquiryMax){
             administrationnumber=EnquiryMax+1;
         }else{
              administrationnumber=RegistrationMax+1;
         }
     
}
    
  
             
     private void RegistrationMaxCount(){
         try{
                   String sql= "SELECT MAX(administrationnumber) FROM Registrationtable";
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                     RegistrationMax =rs.getInt("MAX(administrationnumber)");
                       
                   }
                         
                        System.out.println("Successfully count the administration number");
          
                 
            
             }catch(SQLException e){
                 System.out.println("Fail to count the  administration number"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully close the data base");
                 }catch(SQLException e){
                     System.out.println("Fail to  cllose the data base"+e);
                 }
    
}
     }
     
     
     
     private void EnquiryMaxcount(){
         try{
                   String sql= "SELECT MAX(administrationnumber) FROM Enquriytable";
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                     EnquiryMax =rs.getInt("MAX(administrationnumber)");
                       
                   }
                         
                        System.out.println("Successfully count the administration number");
          
                 
            
             }catch(SQLException e){
                 System.out.println("Fail to count the  administration number"+e);
             }finally{
                 try{
                    
                     pst.close();
                     System.out.println("Successfully close the data base");
                 }catch(SQLException e){
                     System.out.println("Fail to  cllose the data base"+e);
                 
     }
}
     }
     
     
     int Return(){
         return administrationnumber;
     }
}

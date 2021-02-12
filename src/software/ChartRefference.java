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

/**
 *
 * @author ELCOT
 */
public class ChartRefference {
    
       Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    static int friendsCount;
    static int OnlineCount;
    static int FriendsCount;
    static int AdvertisementCount ;
    static int OtherCount;
    static int PamphletCount;
    static int noneCount;
    ChartRefference(){
        con=ConnectionDb.DbConnection();  
        
        getEnquriydataGraphFriends();
        getEnquriydataGraphOnlineCount();
        getEnquriydataGraphAdvertisementCount();
        getEnquriydataGraphOtherCount();
        getEnquriydataGraphPamphletCount();
        getEnquriydataGraphnoneCount();
           
    }
    
          
    
      private void getEnquriydataGraphFriends(){
           // table-name where your date-column < '2013-12-13' and your date-column >= '2013-12-12'  
         try{
             String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'friends' THEN 1 ELSE 0 END) as FriendsCount  FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      friendsCount =rs.getInt("FriendsCount");
                      System.out.println(friendsCount+"result");
                   }
                   
            //       String sql= "SELECT * FROM   Enquriytable WHERE Dob BETWEEN '?' and '?';"
              //                  + "SELECT SUM(CASE WHEN aboutMyfs = 'Online' THEN 1 ELSE 0 END) as OnlineCount,SUM(CASE WHEN aboutMyfs = 'Friends' THEN 1 ELSE 0 END) as FriendsCount,"
                //                +"SUM(CASE WHEN aboutMyfs = 'Advertisement' THEN 1 ELSE 0 END) as AdvertisementCount,SUM(CASE WHEN aboutMyfs = 'Pamphlet' THEN 1 ELSE 0 END) as PamphletCount,"
                  //              +"SUM(CASE WHEN aboutMyfs = 'Other' THEN 1 ELSE 0 END) as OtherCount,SUM(CASE WHEN aboutMyfs = 'none' THEN 1 ELSE 0 END) as noneCount,"
                    //            +"COUNT(*) as TotalCount FROM Enquriytable;";
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                //     pst.setString(1, ((JTextField)FromDate.getDateEditor().getUiComponent()).getText());    //1
                //     pst.setString(2, ((JTextField)ToDate.getDateEditor().getUiComponent()).getText());    //2 
                     
                     
                     
            /*    String sql1= "SELECT SUM(CASE WHEN aboutMyfs = 'Friends' THEN 1 ELSE 0 END) as OnlineCount,SUM(CASE WHEN aboutMyfs = 'Friends' THEN 1 ELSE 0 END) as FriendsCount,"
                                +"SUM(CASE WHEN aboutMyfs = 'Advertisement' THEN 1 ELSE 0 END) as AdvertisementCount,SUM(CASE WHEN aboutMyfs = 'Pamphlet' THEN 1 ELSE 0 END) as PamphletCount,"
                                +"SUM(CASE WHEN aboutMyfs = 'Other' THEN 1 ELSE 0 END) as OtherCount,SUM(CASE WHEN aboutMyfs = 'none' THEN 1 ELSE 0 END) as noneCount,"
                                +"COUNT(*) as TotalCount FROM Enquriytable;";

                   pst =con.prepareStatement(sql1);*/
                   
                  //    if(rs.next()){
                  //  OnlineCount=rs.getInt("COUNT(OnlineCount)"); 
                  // FriendsCount= rs.getInt("COUNT(FriendsCount)");
                   //AdvertisementCount= rs.getInt("COUNT(AdvertisementCount)");
               //    PamphletCount= rs.getInt("COUNT(PamphletCount)");
               //    OtherCount= rs.getInt("COUNT(OtherCount)");
                //   noneCount= rs.getInt("COUNT(noneCount)");
                //   }
                   
                   
                   
                  // System.out.println(FriendsCount);
                     
                   
                         
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
     
    private void getEnquriydataGraphOnlineCount(){ 
     
        try{
             String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'online' THEN 1 ELSE 0 END) as onlineCount  FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      OnlineCount =rs.getInt("onlineCount");
                      System.out.println(friendsCount+"result");
                   }
                   
           
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                
                         
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
       private void getEnquriydataGraphAdvertisementCount(){  
       
          
            try{
             String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'advertisement ' THEN 1 ELSE 0 END) as advertisementCount   FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      AdvertisementCount =rs.getInt("advertisementCount");
                      System.out.println(friendsCount+"result");
                   }
                   
           
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                
                         
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
    private void getEnquriydataGraphOtherCount(){//
           
         try{
             String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'OtherCount' THEN 1 ELSE 0 END) as otherCount  FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      OtherCount =rs.getInt("otherCount");
                      System.out.println(friendsCount+"result");
                   }
                   
           
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                
                         
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
            private void getEnquriydataGraphPamphletCount(){ 
              
                 try{
             String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'pamphlet' THEN 1 ELSE 0 END) as pamphletCount  FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      PamphletCount =rs.getInt("pamphletCount");
                      System.out.println(friendsCount+"result");
                   }
                   
           
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                
                         
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
            private void getEnquriydataGraphnoneCount(){
                 try{
                     String sql= "SELECT COUNT(CASE WHEN aboutMyfs = 'none' THEN 1 ELSE 0 END) as noneCount  FROM Enquriytable;";//COUNT(*) as TotalCount 
                   pst =con.prepareStatement(sql);
                   rs= pst.executeQuery();
                   
                  
                     
                   if(rs.next()){
                      noneCount =rs.getInt("noneCount");
                      System.out.println(friendsCount+"result");
                   }
                   
           
                     pst =con.prepareStatement(sql);
                      rs= pst.executeQuery();
                
                         
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
           
           
        
        
           int Returnfriends(){
          return friendsCount;
      }
           int ReturnOnline(){
          return OnlineCount;
      }
           int ReturnAdvertisement(){
          return AdvertisementCount;
      }
           int ReturnOther(){
          return OtherCount;
      }
           int ReturnPamphlet(){
          return PamphletCount;
      }
           int Returnnone(){
          return noneCount;
      }
}

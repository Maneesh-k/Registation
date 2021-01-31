/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;


import java.sql.*;
/**
 *
 * @author ELCOT
 */
public class ConnectionDb {
    Connection con=null;
    
    public static Connection  DbConnection(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:DataBase.db","","");
            System.out.println("1");
            return con;
            
        }catch(Exception e){
   System.out.println(e);
   return null;
        }
    
    }
}

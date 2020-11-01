/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminssionmanager;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class updateDbTest {
    updateDbTest(){
        try{
        String conString= "jdbc:mysql://localhost:3306/adminssion manager";
              String username= "root";
              String Password = "";
              PreparedStatement ps;
              java.sql.Connection con = DriverManager.getConnection(conString, username, Password);
              String sql= " UPDATE s_info SET name = ? WHERE stud_id = 'Student00338'";
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
              ps.setString(1, "oyinmi");
              //ResultSet rs = 
              ps.executeUpdate();
             // ArrayList <String> name= new ArrayList();
              //while(rs.next()){}
        }
        catch(Exception e ){}
    }
    
   public static void main (String []args){
    new updateDbTest();  
  } 
}

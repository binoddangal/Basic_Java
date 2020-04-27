/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Binod Dangal
 */
public class DeleteUser {
     private static Connection conn = null;
    public static void main(String[] args) {
        String dbUrl="jdbc:mysql://localhost:3306/usertable";
        String dbuserName = "root";
        String dbPassword = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver loaded successfully"+ex);
        }

//        Connecting the database 
        try {
            conn  = (Connection) DriverManager.getConnection(dbUrl,dbuserName,dbPassword);
            System.out.println("Connected Successfully!!");
        } 
        catch (SQLException ex) {
            System.out.println("Sorry could not connect to db! please check your connection." + ex);
        } 
        
        try{
            String query = "DELETE FROM user_tbl WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setString(1,"Binod Dangal");
//            stmt.setString(2, "binoddangal");
            stmt.setInt(1, 2);
            
            int result =stmt.executeUpdate();
            if(result>0)
            {
                System.out.println("Data Deleted successfully");
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
}

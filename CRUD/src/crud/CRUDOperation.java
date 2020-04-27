/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.*;

/**
 *
 * @author Binod Dangal
 */
public class CRUDOperation {
    public static void main(String[] args) 
    {
        String url = "jdbc:mysql://localhost:3306/demodb";
        String database = "root";
        String password = "";
        
        try
        {
            Connection conn = DriverManager.getConnection(url, database, password);
            if (conn != null)
            {
                System.out.println("Database connected successfully");
                conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
       
        //Insert data
        
        try
        {
            Connection conn = DriverManager.getConnection(url, database, password);
            String sql = "INSERT INTO record (name, address, contact, email)" + " VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            String name = "Binod";
            String address = "Thali";
            String contact = "9823781326";
            String email = "binod@gmail.com";
            
            stmt.setString(1, name);
            stmt.setString(2, address);
            stmt.setString(3, contact);
            stmt.setString(4, email);
            
            int rows = stmt.executeUpdate();
            
            if(rows > 0)
            {
                System.out.println("Inserted successfully");
                conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        //Read Data
        
        try
        {
            Connection conn = DriverManager.getConnection(url, database, password);
            String sql = "SELECT * FROM record";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                String email = rs.getString("email");
                
                System.out.println(id + ":" + name + ", " + address + ", " + contact + ", " + email );
            }
            
            conn.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        //Update Data
        
        try
        {
            Connection conn = DriverManager.getConnection(url, database, password);
            String sql = "UPDATE record SET name=?, address=?, contact=?, email=? WHERE id =1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, "Ramesh");
            stmt.setString(2, "Jorpati");
            stmt.setString(3, "9841256327");
            stmt.setString(4, "ramesh@gmail.com");
            
            int rowsUpdate = stmt.executeUpdate();
            
            if(rowsUpdate > 0)
            {
                System.out.println("Updated successfully");
                conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        //Delete Data
        
        try
        {
            Connection conn = DriverManager.getConnection(url, database, password);
            String sql = "DELETE FROM record WHERE id =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 3);
            
            int rowsDelete = stmt.executeUpdate();
            
            if(rowsDelete > 0)
            {
                System.out.println("Delete successfully");
                conn.close();
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
}

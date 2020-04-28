/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kist.bit.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Binod Dangal
 */
public class DBConnection {
    
    private Connection conn = null;
    
    public DBConnection() {
    if(conn == null){
             connectToDB();
         }

}
    
    public Connection getConnection(){
        return this.conn;
    }
    
     private void connectToDB() {
         
        String dbUrl = "http://localhost:3306/pizza_db";
        String dbuserName = "root";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully!!!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver could not be loaded! Please add mysql driver library in classpath!");
        }

        try {
            conn = DriverManager.getConnection(dbUrl, dbuserName, dbPassword);
            System.out.println("Connected to DB!!!");
        } catch (SQLException ex) {
            System.out.println("Sorry could not connect to db! Please check your conection properties!");
        }
    }
}

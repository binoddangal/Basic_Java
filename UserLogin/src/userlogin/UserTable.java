/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Binod Dangal
 */
public class UserTable extends JFrame {

    /**
     * @param args the command line arguments
     */
     private JButton createBtn;
    private Connection conn = null;
    private JPanel UserInfoPanel;
    
    public UserTable(){
        init();
    }
    
    public void init(){
        setLayout(new GridLayout(1, 1, 20, 20));
        GridBagConstraints gbc= new GridBagConstraints();
        
        //================Customer Info Start==================//
        UserInfoPanel = new JPanel();
        TitledBorder cust_info_border = BorderFactory.createTitledBorder(null, "User Table Creation", 
                TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION , new Font("Calibri",0,12),
                Color.blue);
        UserInfoPanel.setBorder(cust_info_border);
        
        UserInfoPanel.setLayout(new GridBagLayout());
        
        gbc.insets= new Insets(3,3,3,3);
        gbc.gridx=0;
        
        gbc.fill= GridBagConstraints.HORIZONTAL;
        createBtn = new  JButton("Create");
        gbc.gridy=0;
        gbc.gridwidth=2;
        UserInfoPanel.add(createBtn, gbc);
        gbc.gridwidth=1;
        createBtn.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                try {
                    createTableQuery();
                } catch (SQLException ex) {
                    Logger.getLogger(UserTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        add(UserInfoPanel);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //setSize(screenSize);
        setSize(400,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void createTableQuery() throws SQLException
    {
        String query = "CREATE TABLE u_tbl("
                + "id int auto_increment not null primary key,"
                + "username varchar(50),"
                + "password varchar(50))";
        
        if(conn==null){
            connectToDB();
        }
        
        Statement stmt = conn.createStatement();
        int result = stmt.executeUpdate(query);
        if(result>0)
        {
            System.out.println("Table Created successfuly");
        }
        else{
            //insert query failure
        }
    }
    
    
    
    public static void main(String[] args) throws SQLException {
        new UserTable();
    }

    private void connectToDB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

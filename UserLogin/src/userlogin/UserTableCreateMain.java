/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Binod Dangal
 */
public class UserTableCreateMain {
   private static JButton createBtn;
    private static Connection conn = null;
    private static  JPanel UserInfoPanel;
    
    public static void main(String[] args) {
        String dbUrl="jdbc:mysql://localhost:3306/usertable";
        String dbuserName = "root";
        String dbPassword = "";
       
        JFrame j = new JFrame();
        j.setLayout(new GridLayout(1, 1, 20, 20));
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
                    String query = "CREATE TABLE user_tbl("
                + "id int auto_increment not null primary key,"
                + "username varchar(50),"
                + "password varchar(50))";

                if(conn==null){

                //        Trying to connect the jdbc driver which is in the projects/projectName/libraries/mysql/com.mysql.jdbc/driver.class
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
                } catch (SQLException ex) {
                    Logger.getLogger(UserTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        j.add(UserInfoPanel);
        
        
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //setSize(screenSize);
        j.setSize(400,600);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}

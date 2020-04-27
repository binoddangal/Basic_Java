/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginScreenWithDB;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Binod Dangal
 */
public class Login extends JFrame{
    private JLabel userNameLable, passwordLable;
    private JButton loginbtn, canclebtn;
    private JTextField userNameTxt, passwordTxt;
    
    public Login()
    {
        init();
    }
    private void init()
    {
        setLayout(null);        
        userNameLable = new JLabel("Username :");
        userNameLable.setBounds(30, 50, 100, 20);
        add(userNameLable);
        userNameTxt = new JTextField();
        userNameTxt.setBounds(140, 50, 200, 20);
        add(userNameTxt);
        
        passwordLable = new JLabel("Password :");
        passwordLable.setBounds(30 , 80 ,100, 20);
        add(passwordLable);
        passwordTxt = new JTextField();
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(140, 80, 200, 20);
        add(passwordTxt);
        
        loginbtn = new JButton("Login");
        loginbtn.setBounds(80, 120, 100, 30);
        loginbtn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed (ActionEvent ae)
            {
                try{
                    String user = userNameTxt.getText();
                    String pass = passwordTxt.getText();
                    Connection conn = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/purbanchal_university","root","");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery("Select * from tbl_user_login Where username='"
                             + user + "' and password='"+ pass + "'" );
                    if( rs.next())
                    {
                        JOptionPane.showMessageDialog(null, "Congratulation !!!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Try Again !!!");
                    }
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }
            }
        });
        add(loginbtn);
      
        canclebtn = new JButton("Cancle");
        canclebtn.setBounds(200, 120, 100, 30);
        canclebtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                userNameTxt.setText(" ");
                passwordTxt.setText("");
            }
        });
        add(canclebtn);
        
        addWindowListener(new WindowAdapter()
            {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Login frame = new Login();
        frame.setSize(400 , 200);
        frame.setTitle("Login");
        frame.setVisible(true);
    }
}

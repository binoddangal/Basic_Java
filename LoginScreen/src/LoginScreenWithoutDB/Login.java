/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginScreenWithoutDB;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Binod Dangal
 */
public class Login extends JFrame{
    private JLabel userNameLable, passwordLable, msgsuccesslabel, msglabel;
    private JButton loginbtn, canclebtn;
    private JTextField userNameTxt, passwordTxt;
    
    public Login()
    {
        init();
    }
    private void init()
    {
        setLayout(null);
        msglabel = new JLabel("Try Again !!!!");
        msglabel.setBounds(100, 10, 100, 20);
        msglabel.setForeground(Color.RED);
        msglabel.setVisible(false);
        add(msglabel);
               
        msgsuccesslabel = new JLabel("Congratulation !!!!");
        msgsuccesslabel.setBounds(100, 10, 100, 20);
        msgsuccesslabel.setForeground(Color.GREEN);
        msgsuccesslabel.setVisible(false);
        add(msgsuccesslabel);
        
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
        loginbtn.addMouseListener (new MouseAdapter(){
            @Override
             public void mouseClicked(MouseEvent e)
             {
                 String lwtxt = userNameTxt.getText();
                 String passtxt = passwordTxt.getText();
                 
                 if(lwtxt.equals("admin") && passtxt.equals("admin"))
                 {
                     msgsuccesslabel.setVisible(true);
                     msglabel.setVisible(false);
                 }
                 else
                 {
                     msgsuccesslabel.setVisible(false);
                     msglabel.setVisible(true);
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

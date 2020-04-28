/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameProject;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
/**
 *
 * @author Binod Dangal
 */
public class LoginFrame extends Frame{
    private Label userNameLable, passwordLable, msglabel;
    private Button LoginButton, cancleButton;
    private TextField userNameTxt, passwordTxt;
    
    public LoginFrame()
    {
        init();
    }
    
    private void init()
    {
        setLayout(null);
        msglabel = new Label("Invalid Password and Username !!!");
        msglabel.setForeground(Color.red);
        msglabel.setBounds(120, 30, 200, 20);
        add(msglabel);
        msglabel.setVisible(false);
        
        userNameLable = new Label("Username :");
        userNameLable.setBounds(30, 50, 100, 20);
        add(userNameLable);
        userNameTxt = new TextField();
        userNameTxt.setBounds(140, 50, 200, 20);
        add(userNameTxt);
        
        
        passwordLable = new Label("Password :");
        passwordLable.setBounds(30 , 80 ,100, 20);
        add(passwordLable);
        passwordTxt = new TextField();
        passwordTxt.setEchoChar('*');
        passwordTxt.setBounds(140, 80, 200, 20);
        add(passwordTxt);
        
        
        LoginButton = new Button("Login");
        LoginButton.setBounds(80, 120, 100, 30);
        LoginButton.addMouseListener (new MouseAdapter(){
            @Override
             public void mouseClicked(MouseEvent e)
             {
                 String lwtxt = userNameTxt.getText();
                 String passtxt = passwordTxt.getText();
                 
                 if(lwtxt.equals("admin") && passtxt.equals("admin"))
                 {
                     System.out.println("Username :" +lwtxt+ "Password :" +passtxt);
                 }
                 else
                 {
                     msglabel.setVisible(true);
                 }
             }
        });
        add(LoginButton);
        
        
        cancleButton = new Button("Cancle");
        cancleButton.setBounds(200, 120, 100, 30);
        add(cancleButton);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setSize(400 , 200);
        frame.setVisible(true);
    }
}

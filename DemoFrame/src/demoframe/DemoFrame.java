/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoframe;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Binod Dangal
 */
public class DemoFrame extends Frame{
    private Label namelbl, genderlbl, fathernamelbl, passwordlbl, confirmpasswordlbl, citylbl, emaillbl;
    private TextField nametxt, fathernametxt, passwordtxt, confimpasswordtxt, citytxt, emailtxt;
    private Choice genderbx;
    private Button registerbtn, resetbtn;
    
    public DemoFrame()
    {
        init();
    }
    
    private void init()
    {
        setLayout(null);
        
        namelbl = new Label("Name");
        namelbl.setBounds(30, 50, 100, 20);
        add(namelbl);
        nametxt = new TextField();
        nametxt.setBounds(140, 50, 200, 20);
        add(nametxt);
        
        genderlbl = new Label ("Gender");
        genderlbl.setBounds(30 , 80 , 100 , 20);
        add(genderlbl);
        
        genderbx = new Choice();
        genderbx.setBounds(140, 80, 200, 20);
        genderbx.add("Male");        
        genderbx.add("Female");
        genderbx.add("Other");
        add(genderbx);
        
        fathernamelbl = new Label ("Father Name");
        fathernamelbl.setBounds(30, 110, 100, 20);
        add(fathernamelbl);
        fathernametxt = new TextField();
        fathernametxt.setBounds(140 , 110 , 200 , 20);
        add(fathernametxt);
        
        passwordlbl = new Label ("Password");
        passwordlbl.setBounds(30, 140, 100, 20);
        add(passwordlbl);
        passwordtxt = new TextField();
        passwordtxt.setEchoChar('*');
        passwordtxt.setBounds(140, 140, 200, 20);
        add(passwordtxt);
        
        confirmpasswordlbl = new Label("Confirm Password");
        confirmpasswordlbl.setBounds(30, 170, 100, 20);
        add(confirmpasswordlbl);
        confimpasswordtxt = new TextField();
        confimpasswordtxt.setEchoChar('*');
        confimpasswordtxt.setBounds(140, 170, 200, 20);
        add(confimpasswordtxt);
        
        citylbl = new Label("City");
        citylbl.setBounds(30, 200, 100, 20);
        add(citylbl);
        citytxt= new TextField();
        citytxt.setBounds(140, 200, 200, 20);
        add(citytxt);
        
        emaillbl = new Label("Email");
        emaillbl.setBounds(30, 230, 100, 20);
        add(emaillbl);
        emailtxt = new TextField();
        emailtxt.setBounds(140, 230, 200, 20);
        add(emailtxt);
        
        
        registerbtn = new Button("Register");
        registerbtn.setForeground(Color.BLUE);
        registerbtn.setBounds(80, 300, 100, 30);
        add(registerbtn);
        
        resetbtn= new Button("Reset");
        resetbtn.setForeground(Color.BLUE);
        resetbtn.setBounds(200, 300, 100, 30);
        
        //clear the text field
        resetbtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                nametxt.setText(" ");
                fathernametxt.setText(" ");
                passwordtxt.setText(" ");
                passwordtxt.setEchoChar((char)0);
                confimpasswordtxt.setText(" ");
                confimpasswordtxt.setEchoChar((char)0);
                citytxt.setText(" ");
                emailtxt.setText(" ");
            }
        });
        add(resetbtn);
        
        // close the window        
        addWindowListener(new WindowAdapter()
        {
        @Override
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
        });
    }
    public static void main(String[] args) 
    {
        DemoFrame f = new DemoFrame();
        f.setSize(400 , 400);
        f.setTitle("Register Form");
        f.setBackground(Color.PINK);
        f.setVisible(true);
    }
}
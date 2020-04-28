/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaMenu;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Binod Dangal
 */
public class CustomerInfo extends JPanel
{
     private JLabel customerNamelbl,addresslbl,phonelbl;
    private JTextField customerName,address,phone;
    
    public CustomerInfo()
    {
        //setBackground(Color.darkGray);
        draw();
    }
    public void draw()
    {
        TitledBorder cust_info_border=BorderFactory.createTitledBorder(null, "Customer Info", TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION, new Font("Calibri",0,18));
        setBorder(cust_info_border);
        
        GridBagLayout grid = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints();  
        setLayout(grid);
        gbc.insets = new Insets(3,3,3,3);
        
        GridBagLayout layout = new GridBagLayout();  
        this.setLayout(layout);  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
          
        gbc.gridx = 0;
        customerNamelbl=new JLabel("Customer Name :",JLabel.RIGHT);
        gbc.gridy = 0;
        add(customerNamelbl, gbc);  
        
        addresslbl=new JLabel("Address :",JLabel.RIGHT);
        gbc.gridy = 1;
        add(addresslbl, gbc);
        
        phonelbl=new JLabel("Phone :",JLabel.RIGHT);
        gbc.gridy = 2;  
        add(phonelbl, gbc);
       
        gbc.gridx = 1; 
        gbc.ipadx = 200;
        customerName=new JTextField();
        gbc.gridy = 0;
        add(customerName, gbc); 
        
        address=new JTextField();
        gbc.gridy = 1; 
        add(address, gbc);  
         
        phone=new JTextField();
        gbc.gridy = 2; 
        add(phone, gbc);   
    }
}

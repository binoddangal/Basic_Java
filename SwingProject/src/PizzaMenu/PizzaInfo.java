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
public class PizzaInfo extends JPanel
{
     private JLabel pizzaTypelbl,pizzaToppinglbl,pizzaSizelbl;
    private JComboBox type;
    private JCheckBox cheeseCB,sausageCB,oliveCB;
    private JRadioButton smallRB,mediumRB,largeRB;
    
    public PizzaInfo()
    {
        //setBackground(Color.darkGray);
        draw();
    }
    public void draw()
    {
        TitledBorder cust_info_border=BorderFactory.createTitledBorder(null, "Pizza Info", TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION, new Font("Calibri",0,18));
        setBorder(cust_info_border);
        
        GridBagLayout grid = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints();  
        setLayout(grid);
        gbc.insets = new Insets(3,3,3,3);
        
        GridBagLayout layout = new GridBagLayout();  
        this.setLayout(layout);  
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        
        
        gbc.gridx = 0; 
        pizzaTypelbl=new JLabel("Type :",JLabel.RIGHT);
        gbc.gridy = 0; 
        add(pizzaTypelbl, gbc);  
        
        gbc.gridx = 1; 
        String[] pizzaType={"Cheese","Sausage","Olive"};
        type=new JComboBox(pizzaType);
         
        gbc.gridy = 0; 
        add(type, gbc); 
        
          
        
        
        pizzaToppinglbl=new JLabel("Toppings :",JLabel.RIGHT);
        gbc.ipady = 20;  
        gbc.gridx = 0;  
        gbc.gridy = 1;
        add(pizzaToppinglbl, gbc);  
        
        
        cheeseCB=new JCheckBox("Cheese");
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        add(cheeseCB, gbc);  
          
        
        sausageCB=new JCheckBox("Sausage");
        gbc.gridx = 2;  
        gbc.gridy = 1;
        add(sausageCB, gbc);  
        
        oliveCB=new JCheckBox("Olive");
        gbc.gridx = 3;  
        gbc.gridy = 1;
        add(oliveCB, gbc);
        
        pizzaSizelbl=new JLabel("Size :",JLabel.RIGHT);
        gbc.gridx = 0;  
        gbc.gridy = 2;  
        add(pizzaSizelbl, gbc);
        
        ButtonGroup bg=new ButtonGroup();
         
        smallRB=new JRadioButton("Small");
        gbc.gridx = 1;  
        gbc.gridy = 2; 
        bg.add(smallRB);
        add(smallRB, gbc);  
        
         
        mediumRB=new JRadioButton("Medium");  
        gbc.gridx = 2;  
        gbc.gridy = 2; 
        add(mediumRB, gbc);
        bg.add(mediumRB);
          
        largeRB=new JRadioButton("Large");
        gbc.gridx = 3;  
        gbc.gridy = 2;
        bg.add(largeRB);
        add(largeRB, gbc);  
        
        Button b=new Button("Order");
        b.setBounds(50,200,100,40);
        b.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
               calculatePrice();
            }
        });
        gbc.gridx = 3;  
        gbc.gridy = 3;
        add(b,gbc);
    }
    public void calculatePrice()
    {
        String pizzatype,topping,size;
        double price=0;
        pizzatype=type.getItemAt(type.getSelectedIndex()).toString();
        if("cheese".equalsIgnoreCase(pizzatype))
        {
            price+=60;
        }
        else if("sausage".equalsIgnoreCase(pizzatype))
        {
            price+=80;
        }
        
        System.out.println("Price"+price);
    }
}

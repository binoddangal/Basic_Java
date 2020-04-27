/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaMenu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Binod Dangal
 */
public class PizzaMenu extends JFrame
{
     private JPanel customerInfo,pizzaInfo,billInfo;
    
    private JLabel customerNamelbl,addresslbl,phonelbl,typelbl,toppinglbl,sizelbl,amountlbl,deliveryChargelbl,discountlbl,totalAmountlbl,amount,deliveryCharge,discount,totalAmount;
    private JTextField customerName,address,phone;
    private JComboBox type;
    private JCheckBox cheeseCB,sausageCB,oliveCB;
    private JRadioButton smallRB,mediumRB,largeRB;
   /// private JSeprator seprator;
    
    public PizzaMenu()
    {
        init();
    }
    public void init()
    {
        setLayout(new GridLayout(3,1,20,20));
        /*--Customer Info----*/
        
        CustomerInfo c=new CustomerInfo();
        add(c);
        /*----Customer Info End-----*/
        /*----Pizza info start--*/
        PizzaInfo p=new PizzaInfo();
        
        add(p);
        /*------Pizza info Stop--*/
        
        
        billInfo=new JPanel();
        TitledBorder bill_info_border=BorderFactory.createTitledBorder(null, "Bill Info", TitledBorder.CENTER,TitledBorder.DEFAULT_POSITION, new Font("Calibri",0,18));
        billInfo.setBorder(bill_info_border);
        add(billInfo);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        setSize(500,600);
        setVisible(true);
        
        
    }
    public static void main(String[] args) 
    {
        PizzaMenu m=new PizzaMenu();
       
        m.setVisible(true);
    }
}

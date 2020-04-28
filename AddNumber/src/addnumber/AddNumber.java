/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumber;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Binod Dangal
 */
public class AddNumber extends JFrame{

    private JLabel num1Lable, num2Lable, resultlabel;
    private JButton okbtn, exitbtn;
    private JTextField num1Txt, num2Txt, resultTxt;
    
    public AddNumber()
    {
        init();
    }
    private void init()
    {  
        setLayout(null);
        num1Lable = new JLabel("N1 :");
        num1Lable.setBounds(30, 50, 100, 20);
        add(num1Lable);
        num1Txt = new JTextField();
        num1Txt.setBounds(140, 50, 200, 20);
        add(num1Txt);
        
        
        num2Lable = new JLabel("N2 :");
        num2Lable.setBounds(30 , 80 ,100, 20);
        add(num2Lable);
        num2Txt = new JTextField();
        num2Txt.setBounds(140, 80, 200, 20);
        add(num2Txt);
        
        
        resultlabel = new JLabel("Result :");
        resultlabel.setBounds(30 , 110 ,100, 20);
        add(resultlabel);
        resultTxt = new JTextField();
        resultTxt.setBounds(140, 110, 200, 20);
        add(resultTxt);
        
        okbtn = new JButton("Result");
        okbtn.setBounds(80, 160, 100, 40);
        add(okbtn);
        okbtn.addActionListener(new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(num1Txt.getText());
        int b = Integer.parseInt(num2Txt.getText());
        int c = 0;

        if (e.getSource().equals(okbtn)) {
            c = a + b;
            resultTxt.setText(String.valueOf(c));
        }
        }
        });
    
        
        exitbtn = new JButton("Cancle");
        exitbtn.setBounds(200, 160, 100, 40);
        exitbtn.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                num1Txt.setText("");
                num2Txt.setText("");
                resultTxt.setText("");
            }
        });
        add(exitbtn);
       
    }
    public static void main(String[] args) {
        
        AddNumber frame = new AddNumber();
        frame.setSize(400 , 250);
        frame.setTitle("Add Number");
        frame.setVisible(true);
        
    }
}

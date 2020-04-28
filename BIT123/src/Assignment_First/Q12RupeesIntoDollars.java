/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_First;

import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
//WAP to convert Rupees into Dollars.

public class Q12RupeesIntoDollars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double rupees;
        double dollars;
        
        System.out.println("Enter Rupees:");
        rupees = s.nextDouble();
        
        dollars = rupees * 0.0089;
        
        System.out.println("The Rupees is:"+rupees);
        System.out.println("The Dollars is:"+dollars);
    }     
}

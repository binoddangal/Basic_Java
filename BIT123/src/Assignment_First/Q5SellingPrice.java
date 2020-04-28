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
/* WAP to read mark price of radio and find discount which is 30% of mark price then find
the actual selling price of radio. */

public class Q5SellingPrice {
    public static void main(String[] args) {
        double mp;
        double dis = 30.00/100;
        double total;
        Scanner s = new Scanner (System.in);
        
        System.out.println("Enter the Mark Price:");
        mp = s.nextDouble();
        
        total = mp-mp*dis;
        
        System.out.println("The Total Selling Price is:"+total);
    }
}

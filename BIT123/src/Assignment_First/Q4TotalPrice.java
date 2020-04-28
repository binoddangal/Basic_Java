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
//WAP to ask number of quantities and price for per quantity then find total price

public class Q4TotalPrice {
    public static void main(String[] args) {
        float quantities , price , totalprice;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Quentities:");
        quantities = s.nextInt();
        
        System.out.println("Enter Price:");
        price = s.nextInt();
        
        totalprice= quantities * price;
        
        System.out.println("The Total Price is:"+totalprice);
    }
    
}

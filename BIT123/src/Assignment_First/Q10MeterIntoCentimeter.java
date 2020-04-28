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
//WAP to convert meter into centimeter.

public class Q10MeterIntoCentimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double meter;
        double centimeter;
        
        System.out.println("Enter Meter:");
        meter = s.nextDouble();
        
        centimeter = meter*100;
        
        System.out.println("The Centimeter is:"+centimeter);
    }
}

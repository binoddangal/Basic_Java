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
public class Q16MeterCentimeterInch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int meter;
        double centimeter;
        double inch;
        
        System.out.println("Enter Distance Between Two Place in Meter:");
        meter = s.nextInt();
        
        centimeter = meter*100;
        inch = centimeter * 2.54;
        
        System.out.println("Meter:"+meter);
        System.out.println("Centimeter:"+centimeter);
        System.out.println("Inch:"+inch);
    }
}

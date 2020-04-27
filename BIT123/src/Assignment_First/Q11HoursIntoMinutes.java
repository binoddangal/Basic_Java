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
//WAP to convert hours into minutes.

public class Q11HoursIntoMinutes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours;
        int minutes;
        
        System.out.println("Enter Hours:");
        hours = s.nextInt();
        
        minutes = hours*60;
        
        System.out.println("The Hours is:"+hours);
        System.out.println("The Minutes is:"+minutes);
    }
}

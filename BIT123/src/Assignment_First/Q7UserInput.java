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
//. WAP to input roll number, your college name and your name and display it. 

public class Q7UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String name;
        String collegename;
        int roll;
                
        System.out.println("Enter Your Roll Number:");
        roll = s.nextInt();
        
        System.out.println("Enter Your Name:");
        name = s.next();
        
        System.out.println("Enter Your College Name:");
        collegename = s.next();

        
        
        System.out.println("Name:"+name);
        System.out.println("College Name:"+collegename);
        System.out.println("Roll:"+roll);
    }
}

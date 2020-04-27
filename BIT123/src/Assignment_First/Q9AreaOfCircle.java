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
//WAP to find area of circle.

public class Q9AreaOfCircle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        double pi = 3.14 , area;
        int r;
        
        System.out.println("Enter Radius Of Circle:");
        r = s.nextInt();
        
        area = pi * r * r;
        
        System.out.println("The area of Circle is:"+area);
    }
}

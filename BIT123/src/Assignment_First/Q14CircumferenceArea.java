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
//WAP to input radius of circle then find circumference and area.

public class Q14CircumferenceArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double pi = 3.14 , area , circumference;
        int r;
        
        System.out.println("Enter Radius:");
        r = s.nextInt();
        
        area = pi * r * r;
        circumference = 2 * pi * r;
        
        System.out.println("Radius:"+r);
        System.out.println("Area:"+area);
        System.out.println("Circumference:"+circumference);
    }
}

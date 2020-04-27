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
//WAP to read the age of three people then find average age. 

public class Q8AgeOfPeople {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age1 , age2 , age3 , average;
        
        System.out.println("Enter Age Of First person");
        age1 = s.nextInt();
        
        System.out.println("Enter Age Of Second person");
        age2 = s.nextInt();
        
        System.out.println("Enter Age Of Third person");
        age3 = s.nextInt();
        
        average = age1 + age2 + age3;
        average = average / 3;
        
        
        System.out.println("Age Of Fist People:"+age1);
        System.out.println("Age Of Second People:"+age2);
        System.out.println("Age Of Third People:"+age3);
        
        
        System.out.println("Average Age:"+average);
    }
}

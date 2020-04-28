/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Second;


import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
/*Write a Java program to test if an array contains a specific value (get it from
user).*/

public class Q4SpecificValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2018,1021,7692,2020,2012};
        int count=0;
        System.out.println("Enter any date:");
        int getdate=s.nextInt();
        
        for(int i=0;i<arr.length;i++)
        {
            if(getdate==arr[i])
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        
    }
}

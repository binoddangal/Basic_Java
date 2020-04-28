/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Second;

/**
 *
 * @author Binod Dangal
 */
//Write a Java program to sum values of an double type array.

public class Q2SumValueOfAnDoubleTypeArray {
    static int arr[] = {1,3,6}; 
    static int sum() 
    { 
        int sum = 0; 
        int i; 
        
        for (i = 0; i < arr.length; i++) 
        sum +=  arr[i]; 
        
        return sum; 
    } 

    public static void main(String[] args)  
    { 
        System.out.println("Sum of given array is " + sum()); 
    } 
}

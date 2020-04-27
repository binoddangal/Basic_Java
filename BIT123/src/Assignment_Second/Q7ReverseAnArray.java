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
//Write a Java program to reverse an array of integer values

public class Q7ReverseAnArray {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,2,4,5,7,6};
        int[] newarr = new int[arr.length];
        int temp;
        System.out.println("Given array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=arr.length-1,j=0;i>=0;i--)
        {
            temp = arr[i];
            newarr[j]=temp;
            j++;
        }
        System.out.println("The Reversed Array is:");
        for(int i=0;i<newarr.length;i++)
        {
            System.out.println(newarr[i]);
        }
    }
}

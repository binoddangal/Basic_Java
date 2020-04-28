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
//Write a Java program to find the largest element in an array.

public class Q8LargestElement {
     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int arr[] = {1,3,74,4,60,43,1,54};
       int max=0;
       System.out.println("Given Array is:");
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       for(int i=0;i<arr.length;i++)
       {
           for(int j=1;j<arr.length;j++)
           {
               if(arr[i]>arr[j])
               {
                   arr[j] = arr[i];
                   max = arr[j];
               }
           }
       }
       System.out.println("The largest is:"+max);
    }
}

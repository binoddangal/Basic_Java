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
//Write a Java program to remove a specific element from an array.

public class Q6RemoveAElement {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2018,1021,7692,2020,2012};
        int item=2020;
        int[] newarr = new int[arr.length-1];
        
        for(int i=0,k=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
                 continue;
            }
            newarr[k++]=arr[i];
        }
        System.out.println("Removed element is:"+item);
        System.out.println("\nNew array is:");
        for(int i=0;i<newarr.length;i++)
        {
        System.out.println(newarr[i]);
        }
      }
}

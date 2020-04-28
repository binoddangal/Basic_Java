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
//Write a Java program to find the index of an array element.

public class Q5IndexOfAnArrayElement {
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {2018,1021,7692,2020,2012};
        int item=2020;
        System.out.println("The date is:"+item);
        
        
        for(int i=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
                System.out.println("The Index Postion is:"+i);
            }
        }
    }
}

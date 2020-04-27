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

/* Write a Java program to check if the sum of all the 10&#39;s in the array is exactly 30.
Return false if the condition does not satisfy, otherwise true. */
public class Q10ArraySum {
     public static void main(String[] args) {
        int arr[] = {10,2,12,30,10,23,30,10};
        int item=10;
        int count=0;
        int res=0;
        
        for(int i = 0; i<arr.length;i++)
        {
            if(item == arr[i])
            {
                count++;
            }
        }
        res = item*count;
        if(res==30)
        {
        System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

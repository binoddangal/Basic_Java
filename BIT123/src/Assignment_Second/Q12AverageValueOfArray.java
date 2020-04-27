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
/*Write a Java program to compute the average value of an array of integers
except the largest and smallest values. */

public class Q12AverageValueOfArray {
      public static void main(String[] args) {
        int arr[] = {12,123,1,24,46,6,43,31};
        int sum = 0;
        int temp;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    temp =arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    //sorting the array
                }
            }
        }
        for(int i=1; i<arr.length-1;i++)
        {
            sum = sum+arr[i];
        }
        double average = sum/arr.length;
        System.out.println("The largest is:"+arr[arr.length-1]+" and Smallest is:"+arr[0]);
        System.out.println("The average of array except largest and smallest is:"+average);
    }
}

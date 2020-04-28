/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_Second;

import java.util.Arrays;

/**
 *
 * @author Binod Dangal
 */
//Write a Java program to sort a numeric array.

public class Q1SortNumber {
    public static void main(String[] args)
    {
        int [] array = {12,8,9,45,55,62,2,7,14};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) 
        {
            System.out.println(array[i]);
        }
    }
}

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
//Write a Java program to check if two arrays equal.

public class Q11CheckTwoEqualArray {
      public static void main(String[] args) {
        int[] farr={1,2,3,4,5,6};
        int[] sarr={2,3,4,5,6};
        
        if(farr.length==sarr.length)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

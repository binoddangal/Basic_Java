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
/* Write a Java program to initialize array by user input
a. Ask if array is single or multi dimensional
b. Ask For the size of the array
c. Ask for every values in the array
d. Display those values in relevant form. */

public class Q13ArrayByUser {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int type;
        
        System.out.println("1.Single Array");
        System.out.println("2.Multi Array");
        System.out.println("\n Choose any of this:");
        type = s.nextInt();
        switch(type){
            case 1:
                int a[] = new int[100];
                System.out.println("Enter the length of an array:");
                int len = s.nextInt();
                for(int i=0;i<len;i++)
                {
                    System.out.println("Enter the a["+i+"] Element:");
                    a[i]=s.nextInt();
                }
                System.out.print("\n The array is a[] = ");
                for(int i=0;i<len;i++){
                    System.out.print(a[i]+ ", ");
                }
                break;
            case 2:
                int arr[][] = new int[100][100];
                System.out.println("Enter the row and colon of the multidimensional array:");
                int row = s.nextInt();
                int cols = s.nextInt();
                
                System.out.println("You request for"+row+"X"+cols+".");
                
                System.out.println("Enter the Elements:\n");
                for(int i=0;i<row;i++)
                {
                    for(int j =0; j<cols;j++)
                    {
                        System.out.println("Enter the a["+i+"]["+j+"] Element:");
                        arr[i][j] = s.nextInt();
                    }
                }
                
                System.out.println("The multiarray is:\n");
                for(int i=0;i<row;i++)
                {
                    for(int j =0; j<cols;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.print("\n");
                }
                break;
            default:
                System.out.println("Invalid menu item!!");
                break;
        }
    }
}

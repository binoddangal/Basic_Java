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
//Write a Java program to add and multiply two matrices of the same size.
public class Q9Matrix {
     public static void main(String[] args) {
        int a[][] = {{1,2},{2,3}};
        int b[][] = {{1,2},{2,3}};
        int mul[][] = new int[a.length][a.length];
        int sum =0;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
                
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<b.length;k++)
                {
                    sum=sum+a[i][k]*b[k][j];
                }
                mul[i][j]=sum;
                sum=0;
            }
        }   
        
        System.out.println("\n");
        
        for(int i=0;i<mul.length;i++)
        {
            for(int j=0;j<mul[i].length;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_First;

import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
//WAP to add , subtract , multiply and divide the two number with user input

public class Q3SimpleMathInput {
    public static void main(String[] args) {
        int num1, num2, add, subtract, multiply;
        float divide;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter The Numbers:");
        num1 = s.nextInt();
        num2 = s.nextInt();
        
        add = num1+num2;
        subtract = num1-num2;
        multiply = num1*num2;
        divide = num1/num2;
        
        System.out.println("Sum = "+add);
        System.out.println("Difference = "+subtract);
        System.out.println("Multiplication = "+multiply);
        System.out.println("Division = "+divide);
        
    }
}

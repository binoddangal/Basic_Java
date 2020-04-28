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
//WAP to input four digits number then find its reverse.

public class Q15ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, reversed = 0;
        System.out.println("Enter the num:");
        num = s.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}

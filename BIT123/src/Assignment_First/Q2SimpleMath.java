/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_First;

/**
 *
 * @author Binod Dangal
 */
//WAP to add , subtract , multiply and divide the two number

public class Q2SimpleMath {
    public static void main(String[] args) {
     int first, second, add, subtract, multiply;
    float devide;
   

    System.out.print("Enter Two Numbers : ");
    first = 2;
    second = 2;

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
  }
}

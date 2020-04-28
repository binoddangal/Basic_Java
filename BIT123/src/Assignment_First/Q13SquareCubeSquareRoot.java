/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_First;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Binod Dangal
 */
public class Q13SquareCubeSquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double square , cube , squareroot;
        double num;
        
        System.out.println("Enter Number:");
        num = s.nextDouble();
        
        square = num * num;
        cube = num * num * num;
        squareroot = Math.sqrt(num);
        
        System.out.println("Square:"+square);
        System.out.println("Cube:"+cube);
        System.out.println("Square Root:"+squareroot);
    }
    
}

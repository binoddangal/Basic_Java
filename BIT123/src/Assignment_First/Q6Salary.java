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
/*WAP to read basic salary then find tax and allowance, tax is 20% of basic salary and
allowance is 40% of basic salary. Also find out net salary. */

public class Q6Salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double basicsalary;
        double salary;
        double tax = 20.00/100;
        double allowance = 40.00/100;
        
        System.out.println("Enter the salary:");
        basicsalary = s.nextDouble();
        
        salary = basicsalary + basicsalary*allowance;
        salary=salary-salary*tax;
        
        System.out.println("The Net Salary is:"+salary);
    }
}

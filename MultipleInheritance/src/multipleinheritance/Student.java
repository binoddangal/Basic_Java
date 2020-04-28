/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multipleinheritance;

/**
 *
 * @author Binod Dangal
 */
public class Student {
    int m1, m2;
    void getmarks(int x, int y)
    {
        m1=x;
        m2=y;
    }
    void putmarks()
    {
        System.out.println("First Marks" +m1);
        System.out.println("Second Marks" +m2);
    }
}

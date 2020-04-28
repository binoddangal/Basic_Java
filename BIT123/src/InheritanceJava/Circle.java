/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceJava;

/**
 *
 * @author Binod Dangal
 */
public class Circle 
{
    private int radius;
    public final static double pi = 3.14;
    public Circle()
    {
        radius = 7;
    }
    public Circle(int radius)
    {
        this.radius=radius;
    }
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public int getRadius()
    {
        return radius;
    }
    public double area()
    {
        return pi*radius*radius;
    }
    public void showData()
    {
        System.out.println("Radius:"+radius+"\nArea:"+area());
    }
}

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
public class Cylinder extends Circle{
    private double height;
    public final static double pi = 3.14;
    public Cylinder()
    {
        height = 15;
    }
    public Cylinder(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
     public double setHeight(double height)
    {
        return height;
    }
    public Cylinder(double height , int radius)
    {
        super(radius);
        this.height = height;   
    }
    public double area()
    {
        return Circle.pi*getRadius()*getRadius()*height;
    }
    public void showData()
    {
        System.out.println("Radius:"+getRadius()+"\nHeight:"+height+"\nArea:"+area());
    }
}

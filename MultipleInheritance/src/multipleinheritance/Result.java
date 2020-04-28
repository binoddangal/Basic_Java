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
public class Result extends Student implements Sport{
    @Override
    public void spmarks()
    {
        System.out.println("Sport Marks"+sp);
    }
    void disp()
    {
        putmarks();
        spmarks();
        int total = m1 + m2 + sp;
        System.out.println("Total Marks" +total);
    }
}

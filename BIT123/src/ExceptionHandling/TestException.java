/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author Binod Dangal
 */
public class TestException {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        int total = 0;
        try{
            total = b/a;
        }
        catch(Exception e)
        {
            System.out.println("Error Exception !!!" +e);
        }
        finally
        {
            System.out.println("Finished");
        }
    }
    
}

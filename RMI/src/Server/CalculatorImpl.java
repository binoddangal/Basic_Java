/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Binod Dangal
 */
public class CalculatorImpl extends UnicastRemoteObject implements  ICalculator
    {    
    public CalculatorImpl() throws RemoteException{
        super();
    }
    @Override
    public Double calculateInterest(double principal, double time, double rate) throws RemoteException
    {
         double interest = 0.0;
        try {
            interest = (principal * time * rate) / 100;
        } catch (Exception e) {

        }
        return interest;
    }
    
    public static void main(String[] args) {
//        System.setSecurityManager(new SecurityManager());
        try 
        {
            CalculatorImpl cal = new CalculatorImpl();
            Naming.rebind("Calculator",cal);
            System.out.println("Server Waiting");
        } 
        catch (java.net.MalformedURLException me) 
        {
            System.err.println("malformes url:"+me.toString());
        }
        catch (RemoteException ex)
        {
            System.out.println("remot exception"+ex.toString());
        }
    } 
}


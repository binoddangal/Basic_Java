/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Server.ICalculator;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Binod Dangal
 */
public class CalculateInterest {
      public static void main(String[] args) throws NotBoundException {
//        System.setSecurityManager(new SecurityManager());
        try 
        {
            System.out.println("Security manager loader");
            String url = "//localhost/Calculator";
            ICalculator remoteobject = (ICalculator)Naming.lookup(url);
            System.out.println("got remote object");
            System.out.println("Interest = "+remoteobject.calculateInterest(100, 1, 10));
            
        }
        
        catch (java.net.MalformedURLException me) 
        {
            System.err.println("malformes url:"+me.toString());
        }
        catch (RemoteException ex)
        {
            System.out.println("error in lookup"+ex.toString());
        }
    }
}

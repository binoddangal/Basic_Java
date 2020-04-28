/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.rmi.*;
/**
 *
 * @author Binod Dangal
 */
public interface ICalculator extends Remote{
     public Double calculateInterest(double principal, double time, double rate) throws RemoteException;
}

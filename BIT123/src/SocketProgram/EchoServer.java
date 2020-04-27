/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgram;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Binod Dangal
 */
public class EchoServer extends Thread {
    
    private DatagramSocket socket;
    private boolean running;
    private byte[] buf = new byte[256];
    
    public EchoServer()
    {
        try{
            socket = new DatagramSocket(4445);
        }catch (SocketException ex){
            System.out.println(ex);
        }
    }
    @Override
    public void run(){
        running = true;
        
        while (running){
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            try{
                socket.receive(packet);
            }catch (IOException ex){
                System.out.println(ex);
            }
        
        
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        packet = new DatagramPacket(buf, buf.length, address, port);
        String received = new String(packet.getData(), 0, packet.getLength());
        
        if (received.equals("end")){
            running = false;
            continue;
        }
            try {
                socket.send(packet);
            } catch (IOException ex) {
                Logger.getLogger(EchoServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        socket.close();
    }
}

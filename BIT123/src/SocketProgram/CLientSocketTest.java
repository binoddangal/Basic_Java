/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Binod Dangal
 */
public class CLientSocketTest {
    public static void main(String[] args) throws IOException {
        String serverIpAddress = "localhost";
        int serverport = 8888;
        Socket s = new Socket(serverIpAddress, serverport);
        
        String fullName = "Binod Dangal";
        System.out.println("Client: sending fullName to server");
        
        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println(fullName);
        out.flush();
        System.out.println("Client: FullName sent");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String msg = in.readLine();
        System.out.println(msg);
    }
}

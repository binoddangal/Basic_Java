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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Binod Dangal
 */
public class ServerSocketTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Server: Before connection");
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("Server: Server started on port 8888");
        System.out.println("Server: waiting for client to connect");
        
        Socket s = ss.accept();
        
        System.out.println("Server: client connected"+s.getLocalPort());
        System.out.println("Server: recieving text");
            
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String fullName = in.readLine();
        System.out.println("Server: Received text = "+fullName);
        
        String[] splitedName = fullName.split(" ");
        
        String greetMsg = "Welcome... Mr."+splitedName[0];
        
        PrintWriter out = new PrintWriter(s.getOutputStream());
        out.println(greetMsg);
        out.flush();
    }
}

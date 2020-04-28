/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
public class Server {
     public static void main(String[] args) throws IOException 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Server: Before connection");
        ServerSocket ss=new ServerSocket(8888);
        System.out.println("Server: server Started on port 8888");
        System.out.println("Server: waiting for client to connect");
        Socket s=ss.accept();
        System.out.println("Server: client connected "+s.getLocalPort());
        
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out =new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
    
        String received="";
        String send="";
        
        while(!"quit".equalsIgnoreCase(send))
        {
            System.out.println("You :");
            send=input.nextLine();
            out.println(send);
            out.flush();
            System.out.println("listening");
            received=in.readLine();
            System.out.println("Client : "+received);
        }
        out.close();
        
    }
}

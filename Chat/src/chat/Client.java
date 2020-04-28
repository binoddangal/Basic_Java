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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
public class Client {
      public static void main(String[] args) throws IOException 
    {
        Scanner input=new Scanner(System.in);
        String serveripAddress="127.0.0.1";
        int serverPort=8888;
        Socket s=new Socket(serveripAddress,serverPort);
        System.out.println("Connection with server Started");
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out =new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
        
        String send="";
        String received="";
        
        while(!"quit".equalsIgnoreCase(send))
        {
            System.out.println("listening");
            received=in.readLine();
            System.out.println("Server : "+received);
           
            System.out.println("You :");
            send=input.nextLine();
            out.println(send);
            out.flush();
        }
        System.out.println("End");
        in.close();
        
    }
}

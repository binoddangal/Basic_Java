/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwriteSerialization;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Binod Dangal
 */
public class ObjectReadWrite implements Serializable{
    public String name;
    public String roll;
    public String className;
    
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Scanner s = new Scanner(System.in);
        FileInputStream input;
        FileOutputStream output;
        
        try
        {
            output=new FileOutputStream("D:\\Student.ser");
            ObjectReadWrite o=new ObjectReadWrite();
            ObjectOutputStream obj=new ObjectOutputStream(output);
            o.name=s.next();
            o.roll=s.next();
            o.className=s.next();
            obj.writeObject(o);
            
            
            input=new FileInputStream("D:\\Student.ser");
            ObjectInputStream ob=new ObjectInputStream(input);
            ObjectReadWrite m;
            m=(ObjectReadWrite)ob.readObject();
            System.out.println("Name : "+m.name);
            System.out.println("Roll no : "+m.roll);
            System.out.println("Class : "+m.className);
            output.close();
            input.close();
        }
        catch(IOException ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
    }
}

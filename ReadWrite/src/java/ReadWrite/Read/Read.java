/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWrite.Read;

import java.io.FileReader;

/**
 *
 * @author Binod Dangal
 */
public class Read {
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("C:\\Users\\Binod Dangal\\Desktop\\Java Project\read.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }  
}

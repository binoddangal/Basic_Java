/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Binod Dangal
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
          FileReader fileread=new FileReader("D:\\newfile.txt");    
          int i;    
          while((i=fileread.read())!=-1)    
          System.out.print((char)i);    
          fileread.close();    
    }
}
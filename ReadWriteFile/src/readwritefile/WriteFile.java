/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import java.io.FileWriter;

/**
 *
 * @author Binod Dangal
 */
public class WriteFile {
    public static void main(String[] args) {
       try{    
           FileWriter fw=new FileWriter("D:\\newfile.txt");    
           fw.write("Welcome to KIST College.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
    }

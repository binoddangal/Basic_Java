/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author Binod Dangal
 */
public class CreateFile {
        public static void main( String[] args )
   {	
      try {
	     File file = new File("D:\\newfile.txt");
	     
             boolean fvar = file.createNewFile();
	     if (fvar){
	          System.out.println("File has been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
    	} catch (IOException e) {
    		System.out.println("Exception Occurred:");
	        e.printStackTrace();
	  }
   }
}

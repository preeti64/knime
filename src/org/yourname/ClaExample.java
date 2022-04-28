package org.yourname;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ClaExample{

	public static void main(String[] args) throws IOException{
		//FileWriter fileWriter = new FileWriter("poem.txt");
		
		 
		  try { 
			  BufferedWriter writer= new BufferedWriter(new FileWriter("output.txt") );
			  writer.write("hello montana\n lol\n monkey");
			  writer.close();
		 }
		 catch (IOException e) { 
			 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		  
		

	}

}

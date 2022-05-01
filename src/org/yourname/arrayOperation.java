 package org.yourname;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner; 
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Main class.
 * 
 * @author KNIME GmbH
 */
public class Main {

	public static void main(String args[]) {
	     String[] claArray = args;
//	     System.out.println(Arrays.toString(claArray));
	     ArrayList<String> lines = new ArrayList<>();
	     String output = "";
	    //  int num =123;
	     String text ="";
	     
	     int files = 0; // showing the numnber of Command Line Arguments that are file
			String inFile = " ";
		    String outFile = " ";
		   
		    for(int i = 0; i < args.length; i++){
			         String arg = args[i];
			          files++;
			             
			             if(files == 2){
			                 inFile = arg;
			                 
			             }
			             
			             else if(files == 10){
			                 outFile = arg;
			             }
		    }
		    
			
	     String inputType = args[3];

	     String operations = args[5];
	      File file = new File(inFile);
	      try{
	          String num ="";
	           Scanner in = new Scanner(file);
			         while(in.hasNextLine()){
			             String line = in.nextLine();
			             if(inputType.equals("int") ) {
	         		        num=line;
	         		        output=num;
	         		      if(operations.contains("rev")) {
	         		          
	         		          output = String.valueOf(reverseNumber(Integer.parseInt(num)));
//	         		          System.out.println("rev" + "" + output);
//	         		          lines.add(output);
	         		      }
	         		      
	         		      if(operations.contains("neg")) {
	         		        int negativenumber = Integer.parseInt(output)*-1;
	        		        String negativeNumber = String.valueOf(negativenumber);
	        		        output = negativeNumber;
//	        		         		          System.out.println("neg" + "" + output);
	         		        
	         		      }
	         		      lines.add(output);
//	 		       		System.out.println(output);  

	 		      
	 		    
	 		            }
	 		
			             
	      
	 		
	         			if(inputType.equals("String") ) {
	         			    text = line;
	         			    output=text;
	         		    
	         		      if(operations.contains("rev")) {
	         		          
	         		          output = reverseString(text);
//	         		          lines.add(output);
	         		      }
	         		      
	         		      if(operations.contains("cap")) {
	         		         output = output.toUpperCase();
	         		        
	         		      }
//	         		       		System.out.println(output);
	         		       	lines.add(output);
	        
	         		      
	         		    
	         	    	}
			         }
	 	

	    }
	    
	     catch(IOException e)
	                 {
	                    e.printStackTrace();
	                    System.exit(0);
	                 }
	                 
	                  try{
	                	   FileWriter fileWriter = new FileWriter(outFile);
	                	    PrintWriter printWriter = new PrintWriter(fileWriter);
//	                	    printWriter.print("Some String");
//	                	    printWriter.printf("Product name is %s and its price is %d $", "iPhone", 1000);
//	                	    printWriter.close();
					         PrintWriter out = new PrintWriter(outFile);
					         lines.forEach((line)->
					         {
//					             System.out.println(line);
//					             out.println(line);
					             printWriter.printf(line+"\n");
					         });
		                	    printWriter.close();

			         
			     }
			     
			      catch(IOException e)
	                 {
	                    e.printStackTrace();
	                    System.exit(0);
	                 }
	    }             
	    
	     static int reverseNumber(int number) {
	         int reverse=0;
	        while(number != 0)   
	         {  
	             int remainder = number % 10;  
	            reverse = reverse * 10 + remainder;  
	            number = number/10;  
	         }  
	         return reverse;  
	    } 
	    
	    static String reverseString(String str)
	      {
	          String reversedStr = "";
	         for(int i = str.length() - 1; i>=0; i--)
	          {
	              char ch =str.charAt(i);
	              reversedStr += ch;
	          }
	          return reversedStr;

	      }
}

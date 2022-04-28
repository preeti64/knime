package org.yourname;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner; 
import java.io.PrintWriter;
/**
 * Main class.
 * 
 * @author KNIME GmbH
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// Code Added by Preeti
		System.out.println(args);
		ArrayList<String> lines = new ArrayList<>();
	
		//Read Command Line Arguments
		
		int files = 0; // showing the number of Command Line Arguments that are file
		String input = " ";
	    String output = " ";
	    String inputType =" ";
	    String operations= " ";
		
		     //Read the Command Line Arguments
		     
		     for(int i = 0; i < args.length; i++){
		         String arg = args[i];
		         //String[] myArr = [--input, Input.txt, --inputtype, int, --operations, neg,rev
		         //, --threads, 1, --output, Output.txt]
		         var inputFileType = myArr[0];
		         var inputFileName = myArr[1]
		         var inputType = myArr[2];
		         var inputTypeName = myArr[3]
		        		 
		         if(Character.isDigit(arg.charAt(i))){
		             return;
		         }
		         
		         else{  //it will show that it is file name
		             files++;}
		             
		             if(files == 1){
		            	 input = arg;
		                 
		             }
		             
		             else if(files == 2){
		            	 inputType = arg;
		             }
		             else if(files == 3){
		            	 operations = arg;
		             }
		             else if(files == 4){
		            	 output = arg;
		             }
		           
		             
		         
		     }
		     if(inputType instanceof String){
		    	 System.out.println("hellop");
		    	//Reading and Writing from File
			     if(String.valueOf(operations) == "reverse") {    	 
			     System.out.println("Hello");
			     File file = new File(input);
			     
			     //Open the file, Perform the operations(Capitalize, Reverse) and add it to the list
			     
			     try{
			         
			         Scanner in = new Scanner(file);
			         while(in.hasNextLine()){
			             String line = in.nextLine();
			             String reverse = reverseString(line);
			             lines.add(reverse);
			             String capLine = line.toUpperCase();
			             lines.add(capLine);
			            
	    		         }
			         
			         in.close();
			     }
			     catch(IOException e)
	                 {
	                    e.printStackTrace();
	                    System.exit(0);
	                 }

			     
			     try{
			         PrintWriter out = new PrintWriter(output);
			         lines.forEach((line)->
			         {
			             out.println(line);
			             
			             
			         });
			         out.close();
			         
			     }
			     
			     catch(IOException e)
	                 {
	                    e.printStackTrace();
	                    System.exit(0);
	                 }
			     
			
		     }
		     }
		     
		     
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
		     
	
		
		// DO NOT CHANGE THE FOLLOWING LINES OF CODE
//		        System.out.println(String.format("Processed %d lines (%d of which were unique)",
//				Statistics.getInstance().getNoOfLinesRead(),
//				Statistics.getInstance().getNoOfUniqueLines()));
	


}
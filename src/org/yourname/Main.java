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
		
		int files = 0;// showing the number of Command Line Arguments that are file
		String[] claArray = {"--input", "Input.txt","--inputtype","String","--operations","rev" ,"Capitalize","Neg","--threads","1","--output","Output.txt"};
		// input = " ";    --input claArray[0]
		String inputFileName = " ";  //input.txt claArray[1]
		System.out.println(args[3]);
		//String inputType = claArray[3];  
		String inputType = args[3];
        //String operations = claArray[5];
        String operations = args[5];

		//threads = " " --number of threads claArray[9]
		
		String threads = claArray[8];
		
		//outputType = " "  --outputType  c;laArray[11]
		String outputFileName = claArray[9];
		
		 //Read the Command Line Arguments
		     
		     for(int i = 0; i < args.length; i++){
	         String arg = args[i];
             //it will show that it is files
             files++;
             
	             if(files == 2){
            	 inputFileName = arg;	                 
             }	
	             else if(files == 10){
	            	 outputFileName = arg;
		             }
		     }
		     
		     
	             
		    // inputFileName = args[2];
		     File file = new File(inputFileName);
		    	//Reading and Writing from File
		  	 
			 //Open the file, Perform the operations(Capitalize, Reverse) and add it to the list
			     
			     try{
			         
			    	 Scanner in = new Scanner(file);
			         while(in.hasNextLine()){
			             String line = in.nextLine();
			             String reverse ="";
			             String capLine ="";
			             
			             if(inputType == "String" ) {
			     		    
			   		      if(operations.contains(",")==true) {

			   		  String[] operationsParts = operations.split(",");
			   	       String part1 = operationsParts[0]; // 004
			              String part2 = operationsParts[1];
			              if((part1.equals("rev")) && (part2.equals("cap"))){
			            	  reverse = reverseString(line);
					          capLine = line.toUpperCase();
					      

			   		        
			   		    }
			   		    else if((part1.equals("cap")) && (part2.equals("rev"))){
			   		     capLine = line.toUpperCase();
			             lines.add(capLine);
			             reverse = reverseString(line);
			             lines.add(reverse);   
			   		    }
			   		    else{
			   		        System.out.println("Slect atleast one operation");
			   		    }
			              
			   		   }
			   		    
			   		    else{
			   		        
			   		    
			   		    if(operations == "rev") {
			   		    	System.out.println("inside rev");
			   		    	reverse = reverseString(line);
				              }
			   		    
			   		    else if(operations == "cap"){
			   		    	capLine  = line.toUpperCase();
			             lines.add(capLine);

			   		    }
			   		    else{
			   		        System.out.println("Select one operation");
			   		    }
			   		    }
			   		}
			             else {
			            	 System.out.println("xyz");
			             }


			            
			             lines.add(reverse);
			               
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
			         PrintWriter out = new PrintWriter(outputFileName);
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

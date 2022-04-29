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
		String[] claArray = {"--input", "Input.txt","--inputtype","String","int","--operations","rev" ,"Capitalize","Neg","--threads","1","--output","Output.txt"};
		// input = " ";    --input claArray[0]
		String inputFileName = " ";  //input.txt claArray[1]
		
		//inputType = " "  --inputtype  c;laArray[2]
		String inputfileTypeString = claArray[3];
		String inputInfileTypeInt = claArray[4];
		
        //operations =" " --Operations claArray[5]
		
		String optRevorCaps = claArray[6];
		String optRevAndCaps = claArray[7];
		String optNegate = claArray[8];

		//threads = " " --number of threads claArray[9]
		
		String threads = claArray[10];
		
		//outputType = " "  --outputType  c;laArray[11]
		String outputFileName = claArray[12];
		
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
		     if(inputfileTypeString instanceof String) {
		    	//Reading and Writing from File
		  	 
			 //Open the file, Perform the operations(Capitalize, Reverse) and add it to the list
			     
			     try{
			         
			         Scanner in = new Scanner(file);
			         while(in.hasNextLine()){
			             String line = in.nextLine();
			             if (in.hasNextInt()) { // check if next token is an int
			                 System.out.print(in.nextInt()); // display the found integer
			             } 
			             if(args[5] == "rev") {
			             System.out.println("same");
			            // String reverse = reverseString(line);
			            // lines.add(reverse);
			             
			             
			             
			             }
			             if(optRevorCaps == args[7]) {
			             String capLine = line.toUpperCase();
			             lines.add(capLine);
			             }
			             
//			             else {
//			            	 String reverse = reverseString(line);
//				             lines.add(reverse);
//				             String capLine = line.toUpperCase();
//				             lines.add(capLine);
//				             System.out.println(args[5]);
//			             }
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

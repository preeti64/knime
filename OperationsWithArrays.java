package org.yourname;

import java.util.Arrays;

public class OperationsWithArrays {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);

		//Read Command Line Arguments
		String text = "rohit";
		int num =123;
		String[] claArray = {"--input", "Input.txt","--inputtype","String","--operations","rev,cap","--threads","1","--output","Output.txt"};
		
		String inputType = claArray[3];

        String operations = claArray[5];
		String output ="";
		String capOutput = "";
		String outNeg ="";
				
		if(inputType == "int" ) {
		    //System.out.println(operations);
		   if(operations.contains(",")) {

		  String[] operationsParts = operations.split(",");
	       String part1 = operationsParts[0]; // 004
           String part2 = operationsParts[1];
           if((part1.equals("rev")) && (part2.equals("neg"))){
		        output = output + reverseString(text);
		        
		        System.out.println(output);
		        int negativenumber = num*-1;
		        String negativeNumber = String.valueOf(negativenumber);
		        outNeg = outNeg + negativeNumber;
		        System.out.println(outNeg);

		        
		    }
		    else if((part1.equals("neg")) && (part2.equals("rev"))){
		    	int negativenumber = num*-1;
		        String negativeNumber = String.valueOf(negativenumber);
		        outNeg = outNeg + negativeNumber;
		        System.out.println(outNeg);
		    	output = output + reverseString(text);
		        
		        System.out.println(output);
		        

		        
		    }
		    else{
		        System.out.println("select operation");
		    }
		   
		   }
		    
           
		   else {
		    if(operations == "rev") {
		        output = output + reverseNumber(num);
		        System.out.println(output);

		    }
		    else if(operations == "neg") {
		        int negativenumber = num*-1;
		        String negativeNumber = String.valueOf(negativenumber);
		        output = output + negativeNumber;
		        System.out.println(output);

		    }
		    else{
		        System.out.println("select one operation");
		    }
		   }
		
    }
		if(inputType == "String" ) {
		    
		      if(operations.contains(",")) {

		  String[] operationsParts = operations.split(",");
	       String part1 = operationsParts[0]; // 004
           String part2 = operationsParts[1];
           if((part1.equals("rev")) && (part2.equals("cap"))){
		        output = output + reverseString(text);
		        
		        System.out.println(output);
		        capOutput = capOutput + text.toUpperCase();
		        System.out.println(capOutput);

		        
		    }
		    else if((part1.equals("cap")) && (part2.equals("rev"))){
		    	capOutput = capOutput + text.toUpperCase();
		        System.out.println(capOutput);
		    	output = output + reverseString(text);
		        
		        System.out.println(output);
		        

		        
		    }
		    else{
		        System.out.println("SElect operation");
		    }
           
		   }
		    
		    else{
		        
		    
		    if(operations == "rev") {
		        output = output + reverseString(text);
		        System.out.println(output);

		    }
		    else if(operations == "cap"){
		        output = output + text.toUpperCase();
		        System.out.println(output);

		    }
		    else{
		        System.out.println("Select one operation");
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
    // static String[] operationsToPerform(String str) {
    //     String[] operationsParts = operations.split(",");

    //     return(operationsParts);

    // }


}


import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner; 
import java.io.PrintWriter;

public class MyClass {
    public static void main(String args[]) {
     String[] claArray = args;
     System.out.println(Arrays.toString(claArray));
     ArrayList<String> lines = new ArrayList<>();
     
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
          
           Scanner in = new Scanner(file);
		         while(in.hasNextLine()){
		             String line = in.nextLine();
		             if(inputType.equals("int") ) {
 		    
 		      if(operations.contains("rev")) {
 		          
 		          output = output + reverseNumber(num);
 		      }
 		      
 		      if(operations.contains("neg")) {
 		        int negativenumber = num*-1;
		        String negativeNumber = String.valueOf(negativenumber);
		        output = output + negativeNumber;
 		        
 		      }
 		       		System.out.println(output);  

 		      
 		    
 		}
 		
		             
      
 		
 			if(inputType.equals("String") ) {
 		    
 		      if(operations.contains("rev")) {
 		          
 		          output = output + reverseString(text);
 		      }
 		      
 		      if(operations.contains("cap")) {
 		         output = output + text.toUpperCase();
 		        
 		      }
 		       		System.out.println(output);  

 		      
 		    
 		}
		         }
 	

    }
    
     catch(IOException e)
                 {
                    e.printStackTrace();
                    System.exit(0);
                 }
                 
                  try{
		         PrintWriter out = new PrintWriter(outFile);
		         lines.forEach((line)->
		         {
		             out.println(line);
		         });
		         
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

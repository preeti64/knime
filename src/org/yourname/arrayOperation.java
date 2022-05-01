import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
     String[] claArray = args;
     System.out.println(Arrays.toString(claArray));
     String output ="";
     int num =123;
     String text = "rohit";
     String inputType = args[3];

     String operations = args[5];
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

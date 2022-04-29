import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      System.out.println(Arrays.toString(args));
// 		ArrayList<String> lines = new ArrayList<>();
	
		//Read Command Line Arguments
		String text = "rohit";
		int num =123;
		int negateNum;
		int files = 0;// showing the number of Command Line Arguments that are file
		String[] claArray = {"--input", "Input.txt","--inputtype","String","int","--operations","negrev" ,"Capitalize","Neg","--threads","1","--output","Output.txt"};
		// input = " ";    --input claArray[0]
		String inputFileName = " ";  //input.txt claArray[1]
		
		String inputType = claArray[2];
		String inputfileTypeString = claArray[3];
		String inputInfileTypeInt = claArray[4];
		
        String operations = claArray[6];
		String output ="";
		String optRevorCaps = claArray[6];
		String optRevAndCaps = claArray[7];
		String optNegate = claArray[8];

		//threads = " " --number of threads claArray[9]
		
		String threads = claArray[10];
		String string = "004-034556";
		

		//outputType = " "  --outputType  c;laArray[11]
		String outputFileName = claArray[12];
        // if int negate 		
		if(inputType == "int" ) {
		    System.out.println(operations);
		  //  if(operations.contains(",")) {
		        
		  //  String[] operationsParts= operationsToPerform(operations);
	   //     String part1 = operationsParts[0]; // 004
    //         String part2 = operationsParts[1];
		  //  }
		    if(operations == "rev") {
		        output = output + reverseNumber(num);
		    }
		    if(operations == "Neg") {
		        int negativenumber = num*-1;
		        String negativeNumber = String.valueOf(negativenumber);
		        output = output + negativeNumber;
		    }
		}
		if(inputType == "String" ) {
		    if(operations == "rev") {
		        output = output + reverseString(text);
		    }
		    else if(operations == "Capitalize"){
		        output = output + text.toUpperCase();
		    }
		}
		System.out.println(Arrays.toString(claArray));
        String reverse = reverseString(text);
        String capLine = text.toUpperCase();
		System.out.println(reverse);
		System.out.println(reverseNumber(num));
		
		System.out.println(capLine);
		


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
    static String[] operationsToPerform(String str) {
        String[] operationsParts = operations.split(",");
    
        return(operationsParts);
        
    }
          
   
}

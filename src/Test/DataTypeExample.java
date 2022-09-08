package Test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int num1 = 30;
       int num2 = 20;
       int num3 = 50;
       
      int Sum = num1 + num2+ num3 ;
      int mul = num1 * num2;
      float div = (float) num1 / num2;
      
       // this is called explicit type casting when we need 
       // to convert 1 data type to another data type//
      
    		 System.out.println("The Num of 2 number is " + (num1 + num2+ num3));
    		 System.out.println("The Mul 0f 2 number is " + mul);
    		 System.out.println("The output of 2 number is " + div);
    		 
    		 String Str1 = "Clean World Green World";
    	 
    		 System.out.println (Str1);
    		 System.out.println ("The length of the string is " + Str1.length());
    		 char ch1 = Str1.charAt(0)	;
    		 System.out.println("The first char is "+ ch1);
    		
    		
    		 char Ch2 = Str1.charAt(Str1.length()-1);
             System.out.println("The last char is " + Ch2);
             
             System.out.println("The String in upper case is" + Str1.toUpperCase());
             System.out.println("The String in lower case is" + Str1.toLowerCase());
    		 

    		
	}

}

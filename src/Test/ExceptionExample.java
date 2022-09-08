package Test;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           			int array[] = {1,2,3};
           			int num = 10;
           			
           			try	{
           				
           				//int res = num/0;
           		System.out.println(array[2]);
           			
	} catch(ArrayIndexOutOfBoundsException e) {

		System.out.println("Inside the array Catch Block");
		
		
	} catch (ArithmeticException e) {	
		System.out.println( "Inside the Arithmatich Block");
	}finally {
		System.out.println("Inside Finally Block");
	}
           			
           			System.out.println("After Exception");
}
	
}

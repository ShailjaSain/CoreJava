package Test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30,40,50 ,60 };
		
		System.out.println(" Total Numbers are "  +  array1.length);
		
		System.out.println(" The Second Number of array is "  +  array1 [1]);
		System.out.println(" The Second Number of array is "  +  array1 [2]);
		
		// to know the last num of array //
		
		System.out.println( " The  last number of array is " + array1[4]);

		// but if we added one more num after 50  
		// then it will only point out to number 50 as last number as per indexation , so the correct code will be 
	//
		
		System.out.println("The last number of an array is " + array1 [array1.length-1]);
		
		 String[] array2 = {"abc", "def", "ghi"};
		 
		 System.out.println(" Total Words are "  +  array2.length);
		
		 System.out.println(" The Second Word of array is "  +  array2 [1]);
		 System.out.println(" The last word of array is "  +  array2 [array2 .length -1]);
		
	
	     
	
	
	
	
	}


}
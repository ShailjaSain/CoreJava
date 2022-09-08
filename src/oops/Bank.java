package oops;

public class Bank {
	
	int AccountNumber;
	public void DisplayBalance() {
		// VOid is a return type ..it can be void or any other method also like public int which return something and we need to return function with it.
		//however, for void which in itself a return type it can be anything int, boolean, string and so on...
		System.out.println("Inside Display Balance");
		
		
	}
     public int GetBalance() {
    	 return 1000;
     }
     
     public void CloseAccount(int AccountNumber) {
    	 System.out.println(" Inside Bank Close Account");
     }
}

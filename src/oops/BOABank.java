package oops;

public class BOABank extends Bank {
	
	public int CreditCardNum ;
	
    public void CCBalance () {
    	System.out.println("Inside CC Balance");
    
    this.CreditCardNum  = 1000;
    super.AccountNumber = 1234556;
    this.AccountNumber = 7890;
    }
    
    public void CloseAccount(int CCNumber) {
   	 System.out.println(" Inside BOA Close Account");
}
    
}
   
    //Super belong to the Parent class , immediate parent (top class) 



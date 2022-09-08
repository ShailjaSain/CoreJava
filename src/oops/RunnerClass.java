package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee();
		E1.Name = "Mike" ;
		E1.Empid = 611178;
		E1.Department = "HR" ;
		
		E1.Display();
		Employee E2 = new Employee("Harsh" , 611177 ,"Medical");
	//	E2.Name = "Jack" ;
	//	E2.Empid = 611179;
	//	E2.Department = "Finance" ;
		
	//	System.out.println(E2.Name);
	//	System.out.println(E2.Empid);
	//System.out.println(E2.Department);
		
		E2.Display();
		
		
		Bank B = new Bank();
		B.DisplayBalance();
		
		int Bal = B.GetBalance();
		
		System.out.println("The Balance is " + Bal);
		System.out.println("The Balance is " + B.GetBalance());
	
         BOABank B1 = new BOABank() ;
         B1.CCBalance();
         B1.DisplayBalance();
       
          OverloadingExample obj = new OverloadingExample() ;
          int recArea	= obj.GetArea(3,4);
          int SquArea   = obj.GetArea(4) ;
          float recAreafloat = obj.GetArea(4);
          
          System.out.println( " The Rec area is " + recArea);
          System.out.println(" The Square area is " + SquArea);
	     System.out.println("The float area is " + recAreafloat);
	
	   //Overriding Example
	 	B1.CloseAccount(123456);
	 	B.CloseAccount (97890);
	 	
	     Chrome ch= new Chrome();
	     ch.OpenBrowser();
	    
	     
	     Browser Brow = new Chrome();
	     Brow.OpenBrowser();
	     Brow.CloseBrowser();
	     Brow.DisplayName();
	     
	
	
	HondaCar car1 = new HondaCar();
	
	
	EncapsulationEx En  = new EncapsulationEx();
	En.setBalance(3000);
	System.out.println(En.getBalance());
}
	
	
}



package oops;

public class Employee {
	
	public	String Name;
	public  int Empid;
	public  String Department ;
	
	public Employee() {
		System.out.println("inside default constr");
	}
	
	public Employee (String P1 , int P2 ,  String P3) {
		
		Name = P1;
		Empid= P2;
		Department = P3;
	}
	public void Display() {
		System.out.println(Name);
		System.out.println(Empid);
		System.out.println(Department);
		
		
	}
	
}

package Test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// will be very exhaustive testing with N number of data , in this case we use Loops 
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
	
	
	//int num = 2;
//	while(num<=10){
	
	//System.out.println(num);
	//num = num+1;
	//num++ ; // Incremental Operator
	
	//System.out.println(num);
	//num = num+2; //+2 to get all the odd numbers from 1-10
	
	// if we want to skip a number let's say 6 to be skipped , how to do it >
	 //it can be done by 2 ways :
	
	   //   skip the code sysout ..or continue ( in case of continue , we should not have else condition )
	
	int num = 2;
	while(num<=10){
	 
		if(num ==6 ) {
			
			num = num+2;
			break;	
	//} else {
	//System.out.println(num);
	//num = num+1;
	//num++ ; // Incremental Operator
		}
	System.out.println(num);
		
	num = num+2; 
	 //  For Loop
	for (int index=1;index <=10 ;index++) {
		if (index==6) {
			continue;
		}
		System.out.println(index);

}
System.out.println( "after while loop");
}}


    


}









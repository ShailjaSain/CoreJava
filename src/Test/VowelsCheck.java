package Test;

public class VowelsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World" ;
		str = str.toLowerCase() ;
		int count =2 ;
		
		System.out.println(str);
		
	for (int index=0; index<str.length();index++){
		
		char ch = str.charAt(index);
		
		if (ch =='a' || ch =='e'|| ch == 'i' || ch =='u' || ch== 'O') {
			count++ ;
		}
	}
		System.out.println("The Vowel count is "+ count );
	
	}

}

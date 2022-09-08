package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
// arraylist can store dynamic data without worrying about the size. 
//	In array always bother about the size
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"abc","pqr","xyz"};
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Aashi");
		list1.add("Dau");
		list1.add("Papa");
		list1.add("Leanna");	
		
		System.out.println("List is this "+ list1);
		System.out.println("The Size of the array is " + list1.size());
		
		list1.remove(0);

		System.out.println("List is this "+ list1);
		System.out.println("The Size of the array List is " + list1.size());
		
		System.out.println("The data at 4th position is "+ list1.get(2));
		
		list1.set(0,"Shailja");
		System.out.println("List after replacement is this "+ list1);
		
		list1.add(1, "Shelly");

		System.out.println("List is this "+ list1);
		
		Collections.sort(list1);
		System.out.println("This is the list after sorting " + list1);
		
		for (int index=0 ;index<list1.size();index++) {
			System.out.println(list1.get(index));
			
		for (String name :list1) {
			System.out.println(name);
			
		}
		
		for (int index1=0;index1<list1.size();index1++) {
			if(list1.get(index1).equals("Papa")) {
				char[] Index;
				System.out.println(Index);
				break;
			}
		
		
		}
		
	}

	}
}
//a solution to find out the position of an element

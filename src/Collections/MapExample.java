package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer , String> map1 = new HashMap<Integer , String> ();

		map1.put(1, "john");
		map1.put(2, "Mary");
		map1.put(3, "Alex");
		map1.put(4, "Peter");
		map1.put(5, "john");
		map1.put(100, "Archie");
		
		System.out.println(map1);
		System.out.println("The data at the 4th key is " + map1.get(4));
		System.out.println("The Data at the 100th Key is " + map1.get(100));
		 
		map1.remove(100);
		System.out.println(map1);
		
		for (Integer key:map1.keySet()) {
			System.out.println("Key is : " + key);
			System.out.println("Value is : " + map1.get(key));
		}
		
	}

}

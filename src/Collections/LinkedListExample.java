package Collections;

import java.util.ArrayList;

import java.util.LinkedList;


public class LinkedListExample {
// arraylist can store dynamic data without worrying about the size. 
//	In array always bother about the size
	
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Aashi");
		list1.add("Dau");
		list1.add("Papa");
		list1.add("Leanna");	
		
		System.out.println("List is this "+ list1);
		System.out.println("The Size of the array is " + list1.size());
		
	}

}

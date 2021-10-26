package Array1;

import java.util.LinkedList;

public class LinkedContain {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Geeks");
		list.add("for");
		
		System.out.println("Does the List contains 'Geeks': " + list.contains("for"));
	}

}

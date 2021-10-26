package Array1;

import java.util.LinkedList;

public class Linked {
	
	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("EcoSport");
		cars.add("Mercedes");
		cars.add("Fox");
		cars.add("Gol");
		
		System.out.println(cars.contains("Gol"));
		cars.addFirst("Palio");
		cars.addLast("Mazda");
		cars.removeLast();
		System.out.println(cars.get(0));
		System.out.println(cars.getLast());
		cars.clear();		
	}

}

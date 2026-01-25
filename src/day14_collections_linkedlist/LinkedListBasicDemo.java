package day14_collections_linkedlist;

import java.util.LinkedList;

public class LinkedListBasicDemo {
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Solapur");
		cities.add("Nashik");
		
		System.out.println("Initial List: "+cities);
		
		//Add at first & last elements
		cities.addFirst("Goa");
		cities.addLast("DiveAagar");
		
		System.out.println("After add at first & last: "+ cities);
		
		//Access elements
		System.out.println("First city: "+cities.getFirst());
		System.out.println("Last city: "+cities.getLast());
		
		//Remove elements
		cities.removeFirst();
		cities.removeLast();
		
		System.out.println("After remove first & last: "+cities);
		
		//Remove by index
		cities.remove(0);
		System.out.println("After removing index 1: "+cities);
		
		//Iterate
		System.out.println("\nIterating LinkedList: ");
		for(String city : cities) {
			System.out.println(city);
		}
		
	}
}

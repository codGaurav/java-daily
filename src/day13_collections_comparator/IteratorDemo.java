package day13_collections_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(20);
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(30);

		System.out.println("Sorting ascending order");
		Collections.sort(list);
		//list.sort(null);
		System.out.println(list);
		
		System.out.println("Sorting Descending order");
		list.sort(Collections.reverseOrder());
		System.out.println(list);
		/*
		 * //ConcurrentModificationException exception getting while remove element in
		 * for each for (Integer i : list) { if (i == 20) { list.remove(i); } }
		 */
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			if (it.next() == 20) {
				it.remove();	// safe
			}
		}
		
		System.out.println("After removing elements in list using iterator while iteration: "+list);
		
		ArrayList<String> cars = new ArrayList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    Iterator<String> itr = cars.iterator();

	    while (itr.hasNext()) {
	      String car = itr.next();   // call next() once

	      if (car.equals("Mazda")) {
	        it.remove();            // safe removal
	      } else {
	        System.out.println(car);
	      }
	    }
	}
}

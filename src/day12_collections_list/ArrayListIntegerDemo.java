package day12_collections_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntegerDemo {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		System.out.println("Before adding elements: " + list + "\n");

		System.out.println("Is arraylist empty? " + list.isEmpty() + "\n");

		System.out.println("----Add elements---");
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(
				"Size of arraylist: " + list.size() + "\n" + "After adding elements in arraylist: " + list + "\n");

		try {
			System.out.println(list.get(10));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index access!");
		}
		System.out.print("2nd index element: " + list.get(2) + "\n");

		System.out.println("Remove 0th element: " + list.remove(0) + "\n");

		System.out.println("arraylist after remove 0th element: " + list);

		System.out.println("set 0th element: " + list.set(0, 10));

		System.out.println("arraylist after set 0th index: " + list);

		System.out.println("is list contains 20: " + list.contains(20));

		list.add(1, 20);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("index " + i + " = " + list.get(i));
		}
		/*
		 * for(int arraylist : list) { System.out.println(arraylist); }
		 */
		list.clear();

		System.out.println("Is arraylist empty? " + list.isEmpty());

		System.out.println("after clear arraylist: " + list);
	}
}

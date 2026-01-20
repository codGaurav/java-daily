package day12_collections_list;

import java.lang.reflect.Field;
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListStringDemo {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		ArrayList<String> list = new ArrayList<>(11);

		System.out.println("before adding elements: " + list.size());
		list.add("Gaurav");
		list.add("Rahul");
		list.add("Amit");
		list.add("Gaurav");

		System.out.println("after adding elements: " + list + "\n");
		System.out.println("class name of list: " + list.getClass().getName());

		System.out.println("Using for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove("Gaurav"); // Gaurav string is 2 times but this fn remove first occurence
		System.out.println("After remove element" + list);

		/*
		 * System.out.println("\nUsing for-each loop:"); for (String name : list) {
		 * System.out.println(name); }
		 */

		List<String> list1 = Arrays.asList("Monday", "Tuesday");
		System.out.println("class name of list:" + list1.getClass().getName());

		list1.set(1, "Friday");
		System.out.println("print list1 " + list1);

		String[] array = { "Jan", "Feb", "Mar" }; // String array of name list2

		List<String> list2 = Arrays.asList(array); // passed list2(array) in asList

		System.out.println("print list3 " + list2);

		List<String> list4 = new ArrayList<>(list2);

		list4.set(2, "April");

		System.out.println("after set 2nd element " + list4);

		List<Integer> list5 = new ArrayList<Integer>();
		list5.add(1);
		list5.add(2);
		list5.add(3);
		list5.add(4);

//		list5.remove(1);		removes 1th index value means 2
		list5.remove(Integer.valueOf(1)); // removes 1 as value means 0th index
		System.out.println("print list5 " + list5);
		List<Integer> list3 = List.of(5, 6, 7, 8, 9);
		// list4.set(0, 5); we cant set in list4
		System.out.println("print list4 " + list3);

		// adding list3 into list5
		list5.addAll(list3);
		System.out.println("after adding list3 into list5 " + list5);

	}
}

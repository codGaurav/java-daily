package day12_collections_list;

import java.util.ArrayList;

public class ArrayListMethodsDemo {
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();

		System.out.println("Is empty? " + cities.isEmpty());

		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Delhi");

		System.out.println("Cities: " + cities);

		System.out.println("Contains Pune? " + cities.contains("Pune"));
		System.out.println("Contains Nagpur? " + cities.contains("Nagpur"));

		Object[] array = cities.toArray();
		String[] array1 = cities.toArray(new String[0]);
		
		System.out.println(array1.length);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		cities.clear();
		System.out.println("After clear, is empty? " + cities.isEmpty());
	}
}

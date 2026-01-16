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

        cities.clear();
        System.out.println("After clear, is empty? " + cities.isEmpty());
    }
}

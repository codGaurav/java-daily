package day12_collections_list;

import java.util.ArrayList;

public class ArrayListIntegerDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers: " + numbers);
        System.out.println("Size: " + numbers.size());

        numbers.remove(1); // index 1 -> 20 remove
        System.out.println("After remove: " + numbers);

        System.out.println("Element at index 1: " + numbers.get(1));
        
        numbers.set(1, 55);
        
        System.out.println(numbers);
    }
}

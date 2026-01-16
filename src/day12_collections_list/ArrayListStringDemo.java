package day12_collections_list;

import java.util.ArrayList;

public class ArrayListStringDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gaurav");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

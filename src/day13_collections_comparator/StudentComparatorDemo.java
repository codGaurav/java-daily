package day13_collections_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;
    double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | Marks: " + marks);
    }
}

// Comparator 1: Sort by Marks (Descending)
class MarksDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.marks, s1.marks);
    }
}

// Comparator 2: Sort by Marks (Ascending)
class MarksAsceComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return Double.compare(s1.marks, s2.marks);
	}
}

// Comparator 3: Sort by Name (Ascending)
class NameAscComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator 4: Sort by Name (Descending)
class NameDescComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s2.name.compareToIgnoreCase(s1.name);
	}
}
public class StudentComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Gaurav", 22, 78));
        students.add(new Student("Rahul", 20, 55));
        students.add(new Student("Nikhil", 25, 80));
        students.add(new Student("Amit", 23, 90));

        System.out.println("=== Original List ===");
        for (Student s : students) {
            s.display();
        }

        // Sort by Marks (Descending)
        Collections.sort(students, new MarksDescComparator());
        System.out.println("\n=== Sorted by Marks (Descending) ===");
        for (Student s : students) {
            s.display();
        }

        // Sort by Name (Ascending)
        Collections.sort(students, new NameAscComparator());
        System.out.println("\n=== Sorted by Name (Ascending) ===");
        for (Student s : students) {
            s.display();
        }
        
        // Sort by Name (Descending)
        Collections.sort(students, new NameDescComparator());
        System.out.println("\n=== Sorted by Name (Descending) ===");
        for(Student s : students) {
        	s.display();
        }
        
        // Sort by Marks (Ascending)
        Collections.sort(students, new MarksAsceComparator());
        System.out.println("\n=== Sorted by Marks (Ascending) ===");
        for(Student s : students) {
        	s.display();
        }
    }
}

package day05_oop_basic;

class Student{
	String name;
	int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this("Gaurav",25);
		System.out.println("Default constructor called!");
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " "+ age);
		System.out.println("Parametrized constructor called!");
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Gaurav", 24);
	}
}

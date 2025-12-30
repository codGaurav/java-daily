package day02_methods_strings;

import java.util.Scanner;

public class MethodDemo {
	public void myMethod(String name, int age) {
		System.out.println("Myself " + name + " & " + age + " year old");

	}

	void checkAge(String name, int age) {
		if (age < 18) {
			System.out.println(name + " you are not allowed to party..");
		} else {
			System.out.println("Allowed to Party!..enjoyy");
		}
	}

	static void testMethod() {
		System.out.println("Hello Gaurav");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
	String name;
		/*
		 * while (true) { System.out.println("Enter name only chars: ");
		 * 
		 * name = sc.next();
		 * 
		 * if (name.matches("[a-zA-z]")) { break; } else {
		 * System.out.println("Invalid Name!..only alphabates allowed"); } }
		 */
		do {
			System.out.println("Enter name only in chars: ");
			name = sc.next();
			if(!name.matches("[a-zA-Z]+")) {
				System.out.println("Invalid Name!!");
			}
				
		}while(!name.matches("[a-zA-Z]+"));
		System.out.print("Enter age: ");

		int age = sc.nextInt();
		MethodDemo md = new MethodDemo();

		md.myMethod(name, age);
		testMethod();
		md.checkAge(name, age);
		sc.close();
	}
}

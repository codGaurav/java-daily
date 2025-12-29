package day01_basics;

import java.util.Scanner;

public class NestedIfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age");
		int age = sc.nextInt();

		sc.nextLine(); /*
						 * added this cause When you call nextInt(), it reads the number but leaves the
						 * "Enter" key (newline character) sitting in the buffer. When you immediately
						 * call nextLine(), it sees that "Enter" key and thinks you've already finished
						 * typing.
						 */
		System.out.println("Enter city");
		String city = sc.nextLine();

		if (age >= 18 && age <= 60) {

			System.out.println("Person age is valid for vote...checking city now");

			if (city.equalsIgnoreCase("Pune")) {
				System.out.println("Person is eligible for voting in Pune");

			} else {
				System.out.println("Person is from "+city+" city. Only Pune residents can vote here.");
			}
		} else {
			System.out.println("Person not eligible for voting based on age");
		}sc.close();
	}
}

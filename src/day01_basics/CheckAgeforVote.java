package day01_basics;

import java.util.Scanner;

public class CheckAgeforVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of voter: ");

		if (sc.hasNextInt()) {
			int age = sc.nextInt();
			if (age < 0 || age > 120) {
				System.out.println("Enter correct/valid age");
			} else if (age < 18) {
				System.out.println("Not Eligible for voting");
			} else {
				System.out.println("Eligible for voting");
			}
			
		} else {
			System.out.println("**Enter Valid age in number");

		}
		System.out.println("----------Ternary Operator---------");

		/*
		 * If you want the user to type their age on the same line as the question, use
		 * System.out.print() instead of System.out.println().
		 * 
		 * println: Moves the cursor to a new line after printing.
		 * 
		 * print: Keeps the cursor on the same line.
		 */
		System.out.print("Enter age ");

		int age = sc.nextInt();
		
		String menAdult = (age >= 18) ? "Men" : "Boy";

		System.out.println("Person is " + menAdult);
		sc.close();
	}
	
}

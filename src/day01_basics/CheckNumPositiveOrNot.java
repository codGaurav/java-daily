package day01_basics;

import java.util.Scanner;

public class CheckNumPositiveOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number");

		if (sc.hasNextInt()) {
			int number = sc.nextInt();
			if (number > 0) {
				System.out.println("Number is Positive");
			} else if (number<0){
				System.out.println("Number is Negative");
			}
			else
				System.out.println("Zero");
		} else
			System.out.println("Please enter a valid number!");
		sc.close();
	}
}

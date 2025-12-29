package day01_basics;

import java.util.Scanner;

public class PrintNumberTakenByUser {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Entered number is: "+num);
			sc.close();
		}
}

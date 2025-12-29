package day01_basics;

import java.util.Scanner;

public class FactorialDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for factorial");
		
		int num = sc.nextInt();
		
		int factorial = 1;
		for(int i=num;i>=1;i--) {
//		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of "+num+" = "+factorial);
		sc.close();
	}
}

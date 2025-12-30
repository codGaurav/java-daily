package day02_methods_strings;
import java.util.Scanner;

public class ReturnDemo {
	static int sumOfTwoNumbers(int num1, int num2) {
		return num1+num2;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of num1");
		int num1 = sc.nextInt();
		System.out.println("Enter value of num2");
		int num2 = sc.nextInt();
		int sum =  sumOfTwoNumbers(num1, num2);
		System.out.println(num1 +" + "+ num2 +" = "+sum);
		
		sc.close();
	}
}

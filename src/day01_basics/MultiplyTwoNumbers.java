package day01_basics;
import java.util.Scanner;

public class MultiplyTwoNumbers {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter two numbers for multiply");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int multiplicationOfTwoNumbers = num1 * num2;
			
			System.out.println(num1+" * "+num2+" = "+multiplicationOfTwoNumbers);
			sc.close();
		}
}

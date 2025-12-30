package day02_methods_strings;

import java.util.Scanner;

public class CalculatorUsingMethods {

	static double add(double num1, double num2) {
		return num1 + num2;
	}

	static double substract(double num1, double num2) {
		return num1 - num2;
	}

	static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	static double division(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Error: Cannot divide by zero!");
			return 0;
		}
		return num1 / num2;
	}

	static double modulus(double num1, double num2) {
		return num1 % num2;
	}

	static void displayMenu() {
		System.out.println("-------Calculator--------");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiply");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Exit");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean continueCalc = true;

		displayMenu();
		while (continueCalc) {
			System.out.print("Choose operation: ");
			int choice = sc.nextInt();

			if (choice == 6) {
				System.out.println("Thanks for using Calculator!");
				break;
			}
			if (choice < 1 || choice > 6) {
				System.out.println("Invalid Choice!!");
				continue;
			}
			System.out.print("Enter first number: ");
			double num1 = sc.nextDouble();
			System.out.print("Enter second number: ");
			double num2 = sc.nextDouble();

			double result = 0;
			switch (choice) {
			case 1:
				result = add(num1, num2);
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case 2:
				result = substract(num1, num2);
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case 3:
				result = multiply(num1, num2);
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case 4:
				result = division(num1, num2);
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			case 5:
				result = modulus(num1, num2);
				System.out.println(num1 + " % " + num2 + " = " + result);
				break;

			}
		}
		sc.close();
	}
}
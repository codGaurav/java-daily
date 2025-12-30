package day02_methods_strings;

public class MethodOverloadingDemo {
	
	static int sumOfTwo(int num1, int num2) {
		System.out.println("Called method: sumOfTwo(int, int)");
		return num1 + num2;
	}
	static double sumOfTwo(double num1, double num2) {
		System.out.println("Called method: sumOfTwo(double, double)");
		return num1 + num2;
	}
	static int sumOfTwo(int num1, int num2, int num3) {
		System.out.println("Called method: sumOfTwo(int, int, int)");
		return num1 + num2 + num3;
	}
	
	static double sumOfTwo(double num1, int num2) {
		System.out.println("Called method: sumOfTwo(double, int)");
		return num1 + num2;
	}
	public static void main(String[] args) {
	
	System.out.println(sumOfTwo(2, 1));
	System.out.println(sumOfTwo(5.1, 3.1));
	System.out.println(sumOfTwo(5, 1, 5));
	System.out.println(sumOfTwo(5.1, 4));
	System.out.println(sumOfTwo(5, 4));
	
	}
}

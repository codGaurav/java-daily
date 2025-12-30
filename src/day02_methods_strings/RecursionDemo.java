package day02_methods_strings;

public class RecursionDemo {

	static void printNumbers(int n) {
		System.out.println("call start: n = " + n);
		if (n == 0) {
			System.out.println("\nbase case hit, returning...\n");
			return;
		}
	
		printNumbers(n - 1);

		System.out.println("Return back: n = " + n);
	}
	static int add(int n) {
		if (n == 0) {
			return 0;
		}
		return n + add(n - 1);
	}
	public static void main(String[] args) {
		printNumbers(3);
		add(3);
	}
}

package day01_basics;

public class BreakContinueFlow {
	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 4, -3, 5, -2, 0, 12, 2, 4 };

		for (int n : numbers) {
			if(n<0) {
				continue;
			}
			if(n==0) {
				break;
			}
			System.out.println(n);
		}
	}
}

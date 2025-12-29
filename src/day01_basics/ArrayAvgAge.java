package day01_basics;

public class ArrayAvgAge {
	public static void main(String[] args) {
		int[] ages = { 10, 35, 22, 25, 50 };

		int sum = 0;
		for (int i = 0; i < ages.length; i++) {

			sum +=ages[i];
			
		}
		System.out.println(sum);
		
		double avg = (double) sum/ages.length;
		System.out.println(avg);
	}
}

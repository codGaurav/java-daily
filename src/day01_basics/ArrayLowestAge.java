package day01_basics;

public class ArrayLowestAge {
	public static void main(String[] args) {
		int[] ages = { 133, 35, 22, 25, 50 };
		
		int lowestAge = ages[0];
		
		for(int i =0; i<ages.length; i++) {
			if(lowestAge>ages[i]) {
				lowestAge = ages[i];
			}
		}
		System.out.println("Lowest Age "+lowestAge);
	}
}

package day01_basics;

public class PrintEvenValueForLoop {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i += 2) {
			System.out.println("Even Numbers: " + i);
			
				
		}
		
		System.out.println("------sum of numbers------");
		int sum = 0;
		for(int j=1; j<=10;j++) {
			//int sum = 0;
			 sum = sum+j;
		}
		 System.out.print("Sum of numbers: "+sum);

	}
}

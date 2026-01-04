package day04_advanced_practice;

import java.util.Scanner;

public class PascalTriWoArray {

	public static void pascalTriangleWithoutArray(int rows) {
		//number = number * (i+j)/(j+1)  ---formula
		// nCr = nC(r-1) × (n-r+1) / r 
		for(int i=0;i<rows;i++) {
			//loop for spaces
			for(int space = 0;space<rows-i-1;space++) {
				System.out.print(" ");
			}
			int number = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(number + " ");
				number = number * (i - j)/(j + 1);
			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Pascal Triangle---");
		
		System.out.print("Enter row number: ");
		int rows = sc.nextInt();
		
		pascalTriangleWithoutArray(rows);
		
		sc.close();
	}
}

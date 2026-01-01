package day03_2darrays_patterns;

public class TwoDArrayBasics {
	public static void main(String[] args) {
		// Method 1: Declare and initialize 2D array
		int[][] matrix1 = { 
				{ 1, 2, 3 },
				{ 4, 5008, 6 },
				{ 7, 8, 9,900 } 
				
		};
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
//				System.out.printf("%6d",matrix1[i][j]);
				System.out.printf("%-6d",matrix1[i][j]); //- = left align
				System.out.printf("%04d", 25); //0 = zero padding


			}
			System.out.println();
		}
	}
}

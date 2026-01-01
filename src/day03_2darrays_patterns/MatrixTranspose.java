package day03_2darrays_patterns;

public class MatrixTranspose {
	public static void main(String[] args) {
		// Original matrix
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		System.out.println("---Original Matrix---");
		
		printMatrix(matrix);
		
		//Transpose Matrix (rows becomes columns)
		
		int[][] transpose = new int[3][3]; 
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		System.out.println("---Transposed Matrix---");
		printMatrix(transpose);
		
        // Find diagonal elements
        System.out.println("\n---Diagonal Elements---");
        System.out.print("Main diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        
        System.out.print("\nSecondary diagonal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2-i] + " "); //Secondary diagonal → row + column = n - 1
            										//Secondary diagonal → matrix[i][n - 1 - i]
        }
        System.out.println();
	}
	// Method to print matrix (reusable!)
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}

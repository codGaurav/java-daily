package day03_2darrays_patterns;

import java.util.Arrays;

public class MatrixAddition {
	public static void main(String[] args) {
		// Create two 3x3 matrices
		int[][] matrix1 = { { 1, 5, 11 },
							{ 6, 9, 12 },
							{ 10, 8, 2 }
						};
		int[][] matrix2 = { { 11, 12, 13 },
							{ 14, 15, 16 },
							{ 17, 18, 19 }
						};

		// Result matrix
		int[][] result = new int[3][3];

		System.out.println("--Matrix1--");
		printMatrix(matrix1);
		// System.out.println(Arrays.deepToString(matrix2));
		
		System.out.println(" ");
		
		System.out.println("--Matrix2--");
		printMatrix(matrix2);
		
		//Add matrices
		System.out.println("Matrix addition (Matrix1 + Matrix2)");
		for(int i = 0; i<3;i++) {
			for(int j =0; j<3;j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		printMatrix(result);
		
		//Matrix substraction
		System.out.println("Matrix substraction (Matrix1 - Matrix2)");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j] = matrix2[i][j] - matrix1[i][j];
			}
		}
		printMatrix(result);
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

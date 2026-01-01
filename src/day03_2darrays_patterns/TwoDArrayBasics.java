package day03_2darrays_patterns;

public class TwoDArrayBasics {
	public static void main(String[] args) {
		// Method 1: Declare and initialize 2D array
		int[][] matrix1 = { 
				{ 1, 2, 3 },
				{ 4, 5008, 6 },
				{ 7, 8, 9,900 } 
				
		};
		
        // Print using nested loops
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
//				System.out.printf("%6d",matrix1[i][j]);
				System.out.printf("%-6d",matrix1[i][j]); //- = left align
				//System.out.printf("%04d", 25); //0 = zero padding


			}
			System.out.println();
		}
		
        // Method 2: Create empty 2D array and fill it
		int[][] matrix2 = new int[3][3];
		
		int counter = 1;
		for(int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				matrix2[i][j] = counter;
				counter++;
				
				//System.out.println(matrix2[i][j]+" ");
				System.out.printf("[ %d ]",matrix2[i][j]);
			}
			System.out.println(" ");
		}
		
        // Print specific elements
		System.out.println("---Accessing Specific Elements---");
		System.out.println("Elements at [0][0] is "+matrix1[0][0]);
		System.out.println("Elements at [1][1] is "+matrix1[1][1]);
		System.out.println("Elements at [2][2] is "+matrix1[2][2]);
		System.out.println("Elements at [2][2] is "+matrix1[2][3]);

        // Print array dimensions
        System.out.println("\n=== Array Information ===");
        System.out.println("Number of rows: " + matrix1.length);
        System.out.println("Number of columns: " + matrix1[2].length);
        
        //Sum of all elements
        int sum =0;
        for(int i=0;i<matrix2.length;i++) {
        	for(int j=0;j<matrix2[i].length;j++) {
        		sum +=matrix2[i][j];
        	}
        	
        }
        System.out.println("Sum of elements in matrix2: "+sum);
	}
}

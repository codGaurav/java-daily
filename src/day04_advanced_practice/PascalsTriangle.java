package day04_advanced_practice;

import java.util.Scanner;

public class PascalsTriangle {
	
	
	public static void pascalTriangle(int rows) {
		
        int[][] triangle = new int[rows][rows];
        
        for(int i=0;i<rows;i++) { 	
        	
        for (int space = 0; space < rows - i - 1; space++) {
                 System.out.print(" ");
             }
        	 
        for(int j=0;j<=i;j++) {
        	if(j==0 || j==i) {
        		triangle[i][j] =1;

        	}
        	else {
        		triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
        	}
        	System.out.print(triangle[i][j]+" ");
        }
        System.out.println();
       }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("=== Pascal's Triangle ===");
        
/*
     1
   	1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
*/
        System.out.print("Enter number of rows you want: ");
        int rows = sc.nextInt();
        pascalTriangle(rows);
        
        sc.close();
	}
	
}

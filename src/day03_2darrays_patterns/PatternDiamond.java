package day03_2darrays_patterns;

import java.util.Scanner;

public class PatternDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows you want: ");
		int num = sc.nextInt();
		
		 System.out.println("=== Diamond Pattern ===");
	        /*
	             *
	            ***
	           *****
	          *******
	         *********
	          *******
	           *****
	            ***
	             *
	         */
		 for(int i=1;i<=num;i++) {
			 for(int j=1;j<=num-i;j++) {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=2*i-1;k++) {
				 System.out.print("*");
			 }
			System.out.println();
			
		 }
	        // Lower half
	        for (int i = num - 1; i >= 1; i--) {
	            // Print spaces
	            for (int j = 1; j <= num - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        System.out.println("\n=== Hollow Diamond ===");
	        /*
	             *
	            * *
	           *   *
	          *     *
	         *       *
	          *     *
	           *   *
	            * *
	             *
	         */
	        
	        // Upper half
	        for (int i = 1; i <= num; i++) {
	            // Spaces before
	            for (int j = 1; j <= num - i; j++) {
	                System.out.print(" ");
	            }
	            // Stars and spaces
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                if (k == 1 || k == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	        // Lower half
	        for (int i = num - 1; i >= 1; i--) {
	            // Spaces before
	            for (int j = 1; j <= num - i; j++) {
	                System.out.print(" ");
	            }
	            // Stars and spaces
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                if (k == 1 || k == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        
	        System.out.println("\n=== Butterfly Pattern ===");

	        for (int i = 1; i <= num; i++) {

	            // left stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // middle spaces
	            for (int j = 1; j <= 2*(num - i); j++) {
	                System.out.print(" ");
	            }

	            // right stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	        for (int i = num; i >= 1; i--) {

	            // left stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // middle spaces
	            for (int j = 1; j <= 2*(num - i); j++) {
	                System.out.print(" ");
	            }

	            // right stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }


	sc.close();
	}

}

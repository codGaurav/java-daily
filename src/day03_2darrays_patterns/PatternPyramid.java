package day03_2darrays_patterns;
import java.util.Scanner;

public class PatternPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows you want: ");
		
		int num = sc.nextInt();
		
        System.out.println("=== Pattern 1: Star Pyramid ===");
        /*
             *
            * *
           * * *
          * * * *
         * * * * *
         */
        for(int i=1; i<=num; i++) {
        	//Print Spaces
        	for(int j=1;j<=num-i;j++) {
        		System.out.print(" ");
        	}
        	//Print Stars
        	for(int k=1;k<=i;k++) {
            	System.out.print("* ");

        	}
        	System.out.println();
        }
        
	}
}	

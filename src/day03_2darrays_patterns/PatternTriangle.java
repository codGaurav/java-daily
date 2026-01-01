package day03_2darrays_patterns;
import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
        System.out.println("=== Pattern 1: Right-Angled Triangle ===");
       /*
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows you want print: ");
        int rows = sc.nextInt();
        
        for(int i=1;i<=rows;i++) {
        	for(int j=1; j<=i;j++) {
            	System.out.print("* ");

        	}
        	System.out.println();
        }
        	
        System.out.println("\n=== Pattern 2: Inverted Triangle ===");
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        
        for(int i=rows;i>=1;i--) {
        	for(int j=i;j>=1;j--) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        
        System.out.println("\n=== Pattern 3: Number Triangle ===");
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        for(int i=1;i<=rows;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println(" ");
        }
        
        System.out.println("\n=== Pattern 4: Same Number Triangle ===");
        /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        */
        for(int i=1;i<=rows;i++) {
        	for(int j=1; j<=i;j++) {
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        sc.close();	
	}
	
}

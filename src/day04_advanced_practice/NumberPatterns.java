package day04_advanced_practice;

public class NumberPatterns {
	
	public static void main(String[] args) {
		
		// Pattern 1: Increasing numbers
        System.out.println("=== Pattern 1: Increasing ===");
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        
        for(int i=5;i>=1;i--) {
        	for(int j =1;j<=i;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
        
     // Pattern 2: Palindrome numbers
        System.out.println("\n=== Pattern 2: Palindrome ===");
        /*
            1
           121
          12321
         1234321
        123454321
        */
        
        for(int i=1; i<=5; i++) {	//loop for rows
        	for(int j=1; j<=5-i; j++) {	//loop for spaces
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++) {		//Incresing numbers
        		System.out.print(j);
        	}
        	for(int j=i-1;j>=1;j--) {	//Decresing numbers
        		System.out.print(j);
        	}
        	System.out.println();
        }
        
     // Pattern 3: Box with numbers
        System.out.println("\n=== Pattern 3: Number Box ===");
        /*
        5 5 5 5 5
        5 4 4 4 5
        5 4 3 4 5
        5 4 4 4 5
        5 5 5 5 5
        */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
        
	}
}

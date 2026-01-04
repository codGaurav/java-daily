package day04_advanced_practice;

import java.util.Scanner;

public class FloydsTriangle {
	
	public static void floydTriangle(int n) {
		int counter = 1; 
        for(int i=1;i<=n;i++) {
        for(int j=1;j<=i;j++) {
        	System.out.print(counter+" ");
        	counter++;
        }
        System.out.println();
       }
	}
	public static void main(String[] args) {		
        System.out.println("=== Floyd's Triangle ===");
        
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        floydTriangle(5);
        
	}
}

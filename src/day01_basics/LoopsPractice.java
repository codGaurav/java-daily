package day01_basics;

import java.util.Scanner;

public class LoopsPractice {
	public static void main(String[] args) throws InterruptedException {
		int i = 1;

		/*
		 * System.out.println("---------while-----------");
		 * 
		 * while (i <= 15) { System.out.println(i); i++; }
		 */

		System.out.println("--------do while-------");
		do {
			System.out.println("Gaurav" + i);
			i++;
		} while (i < 5);

		System.out.println("---------------------------");
		int countdown = 3;
		while (countdown > 0) {
			Thread.sleep(1000);
			System.out.println(countdown);
			countdown--;
		}
		Thread.sleep(1000);
		System.out.println("Happy New Year 2026!!");

		System.out.println("<--------dice example------->");

		Scanner sc = new Scanner(System.in);

		System.out.println("Rolling dice");

		
		int ranDice = (int) (Math.random() * 6) + 1;
		
		System.out.println("Dice rolled: "+ranDice);

		// Print stars equal to dice value
		
		int counter = 0;
		
		while (counter<ranDice) {
			System.out.print("*");
			counter++;
		}
		
		System.out.println("\n------using for loop------");
		if (ranDice >= 1 && ranDice <= 6) {
			
			for(int j = 0; j<ranDice; j++) {
				System.out.print("*");
			}
		}else {
			System.out.println("Dice flipped incorrectly!");
		}sc.close();
	}
}

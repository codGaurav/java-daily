package day04_advanced_practice;

import java.util.Arrays;

public class ArrayProblems {
	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 1, 9, 9, 7, 4, 6 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		// Problem 1: Find second largest
		System.out.println("\n=== Problem 1: Second Largest ===");
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Largest Number: " + largest);
		System.out.print("Second Largest Number: " + secondLargest);

		// Problem 2: Reverse array
		System.out.println("\n=== Problem 2: Reverse Array ===");

		int[] reversedArray = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			reversedArray[i] = arr[arr.length - 1 - i];
		}
		System.out.println("Reversed Array: " + Arrays.toString(reversedArray));

		// Problem 3: Remove duplicates (for sorted array)
		System.out.println("\n=== Problem 3: Remove Duplicates ===");
		int[] sortedArr = { 1, 1, 2, 2, 3, 4, 4, 5, 5, 5 };
		System.out.println("Original: " + Arrays.toString(sortedArr));

		int uniqueCount = 1;
		for (int i = 1; i < sortedArr.length; i++) {
			if (sortedArr[i] != sortedArr[i - 1]) {
				sortedArr[uniqueCount] = sortedArr[i];
				uniqueCount++;
			}
		}
		System.out.print("After removing duplicates: ");
		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(sortedArr[i] + " ");
		}
		System.out.println();

		// Problem 4: Rotate array right by 2 positions
		System.out.println("\n=== Problem 4: Rotate Array Right ===");

		int[] toRotate = { 1, 2, 3, 4, 5 };
		System.out.println("Original Array: "+Arrays.toString(toRotate));
		int rotateBy = 2;

		int[] rotated = new int[toRotate.length];
		
		for(int i = 0; i<toRotate.length;i++) {
			rotated[( i + rotateBy)%toRotate.length] = toRotate[i];
		}
		System.out.println("Rotated by "+rotateBy+" & Rotated Array: "+Arrays.toString(rotated));
		
        // Problem 5: Check if array is palindrome
        System.out.println("\n=== Problem 5: Palindrome Array ===");
        int[] palindromeArr = {1, 2, 3, 2, 1};
        System.out.println("Array: " + Arrays.toString(palindromeArr));
        
        boolean isPalindrome = true;
        
        for(int i =0;i<palindromeArr.length;i++) {
        	if(palindromeArr[i] != palindromeArr[palindromeArr.length - 1 -i]) {
        		isPalindrome = false;
        		break;
        	}
        	
        }
        System.out.println("Is Palindrome? "+isPalindrome);
	}
}
package day10_exception_handling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Age Validation ===");
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            
            validateAge(age);
            System.out.println("✅ Age is valid!");
            
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("\n=== Marks Validation ===");
        try {
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();
            
            validateMarks(marks);
            System.out.println("✅ Marks are valid!");
            System.out.println("Grade: " + calculateGrade(marks));
            
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        System.out.println("\n=== Account Balance Check ===");
        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            
            withdraw(5000, amount);
            
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
        
        sc.close();
    }
    
    static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age cannot be more than 150!");
        }
        if (age < 18) {
            throw new IllegalArgumentException("Must be 18 or older!");
        }
    }
    
    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100!");
        }
    }
    
    static String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        return "F";
    }
    
    static void withdraw(double balance, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance! Available: $" + balance);
        }
        System.out.println("✅ Withdrawal successful!");
        System.out.println("Withdrawn: $" + amount);
        System.out.println("Remaining balance: $" + (balance - amount));
    }
}
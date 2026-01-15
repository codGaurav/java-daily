package day11_exception_handling;

import java.util.Scanner;

// Custom Exception 1: Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Exception 2: Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception 3: Invalid Email
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example 1: Age Validation
        System.out.println("=== Voter Registration ===");
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            checkVotingEligibility(age);
            System.out.println("✅ You are eligible to vote!");
            
        } catch (InvalidAgeException e) {
            System.out.println("❌ " + e.getMessage());
        }
        
        // Example 2: Bank Withdrawal
        System.out.println("\n=== Bank Withdrawal ===");
        try {
            double balance = 5000;
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter withdrawal amount: $");
            double amount = sc.nextDouble();
            sc.nextLine(); // Clear buffer
            
            processWithdrawal(balance, amount);
            
        } catch (InsufficientBalanceException e) {
            System.out.println("❌ " + e.getMessage());
        }
        
        // Example 3: Email Validation
        System.out.println("\n=== Email Registration ===");
        try {
            System.out.print("Enter your email: ");
            String email = sc.nextLine();
            
            validateEmail(email);
            System.out.println("✅ Email is valid!");
            
        } catch (InvalidEmailException e) {
            System.out.println("❌ " + e.getMessage());
        }
        
        sc.close();
    }
    
    static void checkVotingEligibility(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative!");
        }
        if (age > 150) {
            throw new InvalidAgeException("Please enter a valid age!");
        }
        if (age < 18) {
            throw new InvalidAgeException("You must be 18 or older to vote! You are " + age + " years old.");
        }
    }
    
    static void processWithdrawal(double balance, double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new InsufficientBalanceException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient funds! You have $" + balance + " but tried to withdraw $" + amount
            );
        }
        System.out.println("✅ Withdrawal successful!");
        System.out.println("Withdrawn: $" + amount);
        System.out.println("Remaining balance: $" + (balance - amount));
    }
    
    static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailException("Email cannot be empty!");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain @ symbol!");
        }
        if (!email.contains(".")) {
            throw new InvalidEmailException("Email must contain a domain (e.g., .com)!");
        }
        if (email.indexOf("@") > email.lastIndexOf(".")) {
            throw new InvalidEmailException("Invalid email format!");
        }
    }
}
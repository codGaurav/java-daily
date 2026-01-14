package day10_exception_handling;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        
        System.out.println("=== Example 1: Finally Always Executes ===");
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught!");
        } finally {
            System.out.println("✅ Finally block executed (no exception)");
        }
        
        System.out.println("\n=== Example 2: Finally with Exception ===");
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Exception caught: Division by zero");
        } finally {
            System.out.println("✅ Finally block executed (with exception)");
        }
        
        System.out.println("\n=== Example 3: Resource Cleanup ===");
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
            
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            
        } finally {
            // Cleanup - close resources
            if (sc != null) {
                sc.close();
                System.out.println("✅ Scanner closed in finally block");
            }
        }
        
        System.out.println("\n=== Example 4: Database Connection Simulation ===");
        simulateDatabaseOperation();
    }
    
    static void simulateDatabaseOperation() {
        System.out.println("\n📊 Connecting to database...");
        boolean connected = false;
        
        try {
            connected = true;
            System.out.println("✅ Connected to database");
            
            // Simulate some operation
            System.out.println("Executing query...");
            
            // Simulate error
            if (Math.random() > 0.5) {
                throw new Exception("Connection lost!");
            }
            
            System.out.println("✅ Query executed successfully");
            
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            
        } finally {
            if (connected) {
                System.out.println("🔌 Closing database connection...");
                System.out.println("✅ Connection closed safely");
            }
        }
    }
}
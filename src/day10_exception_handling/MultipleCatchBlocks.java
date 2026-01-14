package day10_exception_handling;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Calculator with Exception Handling ===");
        
        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1);  // Can throw NumberFormatException
            
            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);  // Can throw NumberFormatException
            
            int result = num1 / num2;  // Can throw ArithmeticException
            System.out.println("Result: " + result);
            
            int[] arr = new int[5];
            arr[10] = result;  // Can throw ArrayIndexOutOfBoundsException
            
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Please enter valid numbers!");
            System.out.println("Details: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Cannot divide by zero!");
            System.out.println("Details: " + e.getMessage());
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Array index out of bounds!");
            System.out.println("Details: " + e.getMessage());
            
        } catch (Exception e) {
            // General exception - catches anything not caught above
            System.out.println("❌ Error: Something went wrong!");
            System.out.println("Details: " + e.getMessage());
        }
        
        System.out.println("\n✅ Program completed!");
        sc.close();
    }
}
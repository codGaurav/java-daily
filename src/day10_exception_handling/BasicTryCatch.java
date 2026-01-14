package day10_exception_handling;

public class BasicTryCatch {
    public static void main(String[] args) {
        
        System.out.println("=== Example 1: Division by Zero ===");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: Cannot divide by zero!");
            System.out.println("Exception: " + e.getMessage());
        }
        
        System.out.println("\n=== Example 2: Array Index Out of Bounds ===");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Array index is out of range!");
            System.out.println("Exception: " + e.getMessage());
        }
        
        System.out.println("\n=== Example 3: Null Pointer ===");
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("❌ Error: String is null!");
        }
        
        System.out.println("\n=== Example 4: Number Format ===");
        try {
            String text = "abc";
            int num = Integer.parseInt(text);  // NumberFormatException
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Cannot convert string to number!");
        }
        
        System.out.println("\n✅ Program continues executing...");
        System.out.println("Program ended successfully!");
    }
}
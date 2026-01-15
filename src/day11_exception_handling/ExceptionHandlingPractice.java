package day11_exception_handling;

import java.util.Scanner;

class User {
    private String username;
    private String password;
    private int age;
    
    public void setUsername(String username) throws Exception {
        if (username == null || username.trim().isEmpty()) {
            throw new Exception("Username cannot be empty!");
        }
        if (username.length() < 3) {
            throw new Exception("Username must be at least 3 characters!");
        }
        this.username = username;
    }
    
    public void setPassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Password cannot be empty!");
        }
        if (password.length() < 6) {
            throw new Exception("Password must be at least 6 characters!");
        }
        this.password = password;
    }
    
    public void setAge(int age) throws Exception {
        if (age < 0 || age > 150) {
            throw new Exception("Invalid age!");
        }
        if (age < 13) {
            throw new Exception("You must be at least 13 years old to register!");
        }
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("\n✅ User Registration Successful!");
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Password: " + "*".repeat(password.length()));
    }
}

public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║   USER REGISTRATION SYSTEM        ║");
        System.out.println("║   Exception Handling Practice     ║");
        System.out.println("╚═══════════════════════════════════╝");
        
        // Username
        boolean usernameSet = false;
        while (!usernameSet) {
            try {
                System.out.print("\nEnter username (min 3 chars): ");
                String username = sc.nextLine();
                user.setUsername(username);
                usernameSet = true;
            } catch (Exception e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
        
        // Password
        boolean passwordSet = false;
        while (!passwordSet) {
            try {
                System.out.print("Enter password (min 6 chars): ");
                String password = sc.nextLine();
                user.setPassword(password);
                passwordSet = true;
            } catch (Exception e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
        
        // Age
        boolean ageSet = false;
        while (!ageSet) {
            try {
                System.out.print("Enter age: ");
                String ageInput = sc.nextLine();
                int age = Integer.parseInt(ageInput);
                user.setAge(age);
                ageSet = true;
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number!");
                System.out.println("Please try again.");
            } catch (Exception e) {
                System.out.println("❌ " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
        
        user.displayInfo();
        
        System.out.println("\n🎉 Registration complete!");
        sc.close();
    }
}
package day08_advanced_oop;

import java.util.Scanner;

// Payment interface
interface Payment {
    boolean processPayment(double amount);
    String getPaymentMethod();
}

// Credit Card payment
class CreditCardPayment implements Payment {
    
    private String cardNumber;
    private String cardHolder;
    
    CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("\n💳 Processing Credit Card Payment");
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: $" + amount);
        System.out.println("✅ Payment Successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}

// UPI payment
class UPIPayment implements Payment {
    
    private String upiId;
    
    UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("\n📱 Processing UPI Payment");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("✅ Payment Successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "UPI";
    }
}

// Cash payment
class CashPayment implements Payment {
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("\n💵 Processing Cash Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("✅ Payment Received!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}

// PayPal payment
class PayPalPayment implements Payment {
    
    private String email;
    
    PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public boolean processPayment(double amount) {
        System.out.println("\n🅿️ Processing PayPal Payment");
        System.out.println("Email: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("✅ Payment Successful!");
        return true;
    }
    
    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}

public class PaymentSystemInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║     PAYMENT SYSTEM - DAY 8        ║");
        System.out.println("╚═══════════════════════════════════╝");
        
        System.out.print("\nEnter amount to pay: $");
        double amount = sc.nextDouble();
        
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");
        System.out.println("4. PayPal");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Clear buffer
        
        Payment payment = null;
        
        switch (choice) {
            case 1:
                System.out.print("Enter Card Number: ");
                String cardNum = sc.nextLine();
                System.out.print("Enter Card Holder Name: ");
                String holder = sc.nextLine();
                payment = new CreditCardPayment(cardNum, holder);
                break;
                
            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                payment = new UPIPayment(upiId);
                break;
                
            case 3:
                payment = new CashPayment();
                break;
                
            case 4:
                System.out.print("Enter PayPal Email: ");
                String email = sc.nextLine();
                payment = new PayPalPayment(email);
                break;
                
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }
        
        // Process payment - polymorphism in action!
        if (payment != null) {
            System.out.println("\nProcessing payment via: " + payment.getPaymentMethod());
            payment.processPayment(amount);
        }
        
        sc.close();
    }
}
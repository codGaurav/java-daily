package day05_oop_basic;

class BankAccount{
	private double balance;
	
	public void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -=amount;
		}
	
	}
	public double getBalance() {
		return balance;
	}
}
public class BankDemo {
	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		
		acc.deposit(1000);
		acc.withdraw(200);
		
		System.out.println("Balance: " + acc.getBalance());
	}
}

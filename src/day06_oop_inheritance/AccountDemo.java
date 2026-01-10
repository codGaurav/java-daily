package day06_oop_inheritance;

class Account{
	double balance = 50000;
	
	void withdraw(double amount) {
		balance -=amount;
		System.out.println("Balance "+balance);
	}
	
}

class SavingAccount extends Account{
	@Override
	void withdraw(double amount) {
		super.withdraw(amount); //parent method
        System.out.println("Withdrawal from Saving Account");
		
	}
}

public class AccountDemo {
	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount();
	
		acc.withdraw(100);
	}
}

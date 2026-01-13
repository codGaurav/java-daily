package day09_inner_enum_input_date;

import day09_inner_enum_input_date.Bank.Transaction;

class Bank{
	
	private int balance = 5000;
	
	class Transaction{
		void withDraw(int amount) {
			if(amount<=balance) {
				balance -=amount;
				System.out.println("Withdraw succesfull!. Balance: "+ balance);
			}else {
                System.out.println("Insufficient balance");

			}
		}
		
	}
	
	void startTransaction(){
		Transaction t = new Transaction();
		t.withDraw(500);
	}
}
public class InnerClassDemo {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.startTransaction();
	}
}

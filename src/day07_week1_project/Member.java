package day07_week1_project;

public class Member extends Person{

	private int memberId;
	private int booksBorrowed;
	public static final int MAX_BOOKS = 3;
	
	public Member(int memberId, String name, int age) {
		super(name, age);	
		this.memberId = memberId;
		this.booksBorrowed = 0;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public int getBooksBorrowed() {
		return booksBorrowed;
	}
	
	public boolean canBorrowMore() {
		return booksBorrowed<MAX_BOOKS;
	}
	
	public void borrowBook() {
		if(canBorrowMore()) {
			booksBorrowed++;
		}
	}
	
	public void returnBook() {
		if(booksBorrowed>0) {
			booksBorrowed--;
		}
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Member Id: "+memberId+" | Name: "+name + " | Age: "+age+" | Books Borrowed: "+booksBorrowed);

	}
}

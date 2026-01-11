package day07_week1_project;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true; // book isAvailable by default true
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void borrowBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book borrowed successfully!");
		} else {
			System.out.println("Book is already borrowed!");
		}
	}

	public void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book returned!");
		} else {
			System.out.println("Book was not borrowed!");
		}
	}

	public void displayInfo() {
		System.out.println(
				"ID: " + bookId +
				" | Title: " + title +
				" | Author: " + author +
				" | Status: " + (isAvailable ? "Available" : "Borrowed")
			);

	}

}

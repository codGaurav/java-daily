package day07_week1_project;

public class Library {
	private Book[] books;
	private Member[] members;
	private int bookCount;
	private int memberCount;

	public Library(int maxBooks, int maxMembers) {
		books = new Book[maxBooks];
		members = new Member[maxMembers];
		this.bookCount = 0;
		this.memberCount = 0;
	}

	public void addBook(int bookId, String title, String author) {

		if (findBookById(bookId) != null) {
			System.out.println("Book ID already exists!");
			return;
		}
		// 1. Space check
		if (bookCount >= books.length) {
			System.out.println("Library is full. Cannot add more books!");
			return;
		}

		// 2. Create new Book object
		Book newBook = new Book(bookId, title, author);

		// 3. add to array
		books[bookCount] = newBook;

		// 4. increment book count
		bookCount++;

		System.out.println("Book added successfully!");
	}

	public void addMember(int memberId, String name, int age) {

		if (findMemberById(memberId) != null) {
			System.out.println("Member ID already exists!");
			return;
		}
		// 1. space check
		if (memberCount >= members.length) {
			System.out.println("Members list is full. Cannot add more members!");
			return;
		}

		// 2. Create new Person object
		Member newMember = new Member(memberId, name, age);

		// 3. add to array
		members[memberCount] = newMember;

		// 4. increment member count
		memberCount++;

		System.out.println("Member added successfully!");
	}

	private Book findBookById(int bookId) {
		for (int i = 0; i < bookCount; i++) {
			if (books[i].getBookId() == bookId) {
				return books[i];
			}
		}
		return null;
	}

	private Member findMemberById(int memberId) {
		for (int i = 0; i < memberCount; i++) {
			if (members[i].getMemberId() == memberId) {
				return members[i];
			}
		}
		return null;
	}

	public void borrowBook(int memberId, int bookId) {
		Member member = findMemberById(memberId);
		Book book = findBookById(bookId);

		if (member == null) {
			System.out.println("Member not found!");
			return;
		}

		if (book == null) {
			System.out.println("Book not found!");
			return;
		}

		if (!member.canBorrowMore()) {
			System.out.println("Member reached borrow limit!");
			return;
		}

		if (!book.isAvailable()) {
			System.out.println("Book is already borrowed!");
			return;
		}

		book.borrowBook();
		member.borrowBook();

		System.out.println("Book borrowed successfully!");

	}

	public void returnBook(int memberId, int bookId) {
		Member member = findMemberById(memberId);
		Book book = findBookById(bookId);

		if (member == null || book == null) {
			System.out.println("Invalid member or book!");
			return;
		}

		book.returnBook();
		member.returnBook();

		System.out.println("Book returned successfully!");
	}

	public void displayAllBooks() {
		if (bookCount == 0) {
			System.out.println("No books available!");
			return;
		}
		System.out.println("\n--- All Books ---");
		for (int i = 0; i < bookCount; i++) {
			books[i].displayInfo();
		}
	}
	
	public void displayAllMembers() {

	    if (memberCount == 0) {
	        System.out.println("No members found!");
	        return;
	    }

	    System.out.println("\n--- All Members ---");
	    for (int i = 0; i < memberCount; i++) {
	        members[i].displayInfo();
	    }
	}
	
	public void searchBookByTitle(String title) {
		boolean found = false;
		
		for (int i=0; i<bookCount; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				books[i].displayInfo();
				found = true;
			}
		}
		if(!found) {
			System.out.println("Book not found!");
		}
	}
	
	public void removeBook(int bookId) {

	    for (int i = 0; i < bookCount; i++) {

	        if (books[i].getBookId() == bookId) {

	            // shift left
	            for (int j = i; j < bookCount - 1; j++) {
	                books[j] = books[j + 1];
	            }

	            books[bookCount - 1] = null;
	            bookCount--;

	            System.out.println("Book removed successfully!");
	            return;
	        }
	    }

	    System.out.println("Book not found!");
	}

	public void removeMember(int memberId) {

	    for (int i = 0; i < memberCount; i++) {

	        if (members[i].getMemberId() == memberId) {

	            for (int j = i; j < memberCount - 1; j++) {
	                members[j] = members[j + 1];
	            }

	            members[memberCount - 1] = null;
	            memberCount--;

	            System.out.println("Member removed successfully!");
	            return;
	        }
	    }

	    System.out.println("Member not found!");
	}


}

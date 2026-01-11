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

}

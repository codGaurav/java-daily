package day07_week1_project;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library(50, 20);
        boolean running = true;

        System.out.println("=== LIBRARY MANAGEMENT SYSTEM ===");

        while (running) {

            showMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(bookId, title, author);
                    break;

                case 2:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    library.addMember(memberId, name, age);
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    int mId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int bId = sc.nextInt();

                    library.borrowBook(mId, bId);
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    int rmId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int rbId = sc.nextInt();

                    library.returnBook(rmId, rbId);
                    break;

                case 5:
                    System.out.println("Thank you for using Library System!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }

    static void showMenu() {
        System.out.println("\n===== LIBRARY MENU =====");
        System.out.println("1. Add Book");
        System.out.println("2. Add Member");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }
}

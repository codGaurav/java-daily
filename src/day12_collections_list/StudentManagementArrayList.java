package day12_collections_list;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;
    
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    void display() {
        System.out.println("Roll: " + rollNo + " | Name: " + name + " | Marks: " + marks);
    }
}

public class StudentManagementArrayList {
    
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("╔═══════════════════════════════════╗");
        System.out.println("║  STUDENT MANAGEMENT SYSTEM        ║");
        System.out.println("║  Using ArrayList                  ║");
        System.out.println("╚═══════════════════════════════════╝");
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayAllStudents(); break;
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: displayToppers(); break;
                case 7: displayFailedStudents(); break;
                case 8: calculateClassAverage(); break;
                case 9: 
                    System.out.println("✅ Thank you!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
        
        sc.close();
    }
    
    static void displayMenu() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║           MENU                    ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ 1. Add Student                    ║");
        System.out.println("║ 2. Display All Students           ║");
        System.out.println("║ 3. Search Student                 ║");
        System.out.println("║ 4. Update Student                 ║");
        System.out.println("║ 5. Delete Student                 ║");
        System.out.println("║ 6. Display Toppers (>90)          ║");
        System.out.println("║ 7. Display Failed (<40)           ║");
        System.out.println("║ 8. Calculate Class Average        ║");
        System.out.println("║ 9. Exit                           ║");
        System.out.println("╚═══════════════════════════════════╝");
        System.out.print("Choice: ");
    }
    
    static void addStudent() {
        System.out.print("\nEnter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        
        // Check if roll number already exists
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println("❌ Student with this roll number already exists!");
                return;
            }
        }
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        
        students.add(new Student(rollNo, name, marks));
        System.out.println("✅ Student added successfully!");
    }
    
    static void displayAllStudents() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║        ALL STUDENTS               ║");
        System.out.println("╚═══════════════════════════════════╝");
        
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student s : students) {
                s.display();
            }
            System.out.println("\nTotal Students: " + students.size());
        }
    }
    
    static void searchStudent() {
        System.out.print("\nEnter Roll Number to search: ");
        int rollNo = sc.nextInt();
        
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println("\n✅ Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }
    
    static void updateStudent() {
        System.out.print("\nEnter Roll Number to update: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        
        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.print("Enter new Name: ");
                s.name = sc.nextLine();
                
                System.out.print("Enter new Marks: ");
                s.marks = sc.nextDouble();
                
                System.out.println("✅ Student updated successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }
    
    static void deleteStudent() {
        System.out.print("\nEnter Roll Number to delete: ");
        int rollNo = sc.nextInt();
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).rollNo == rollNo) {
                students.remove(i);
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }
    
    static void displayToppers() {
        System.out.println("\n🏆 TOPPERS (Marks > 90):");
        boolean found = false;
        
        for (Student s : students) {
            if (s.marks > 90) {
                s.display();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No toppers found!");
        }
    }
    
    static void displayFailedStudents() {
        System.out.println("\n❌ FAILED STUDENTS (Marks < 40):");
        boolean found = false;
        
        for (Student s : students) {
            if (s.marks < 40) {
                s.display();
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No failed students!");
        }
    }
    
    static void calculateClassAverage() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average!");
            return;
        }
        
        double total = 0;
        for (Student s : students) {
            total += s.marks;
        }
        
        double average = total / students.size();
        System.out.println("\n📊 Class Average: " + average);
    }
}
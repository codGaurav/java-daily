package day14_collections_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

class Task {
	String taskName;

	Task(String taskName) {
		this.taskName = taskName;
	}

	void display() {
		System.out.println("• " + taskName);
	}
}

public class TaskManagerLinkedList {
	static LinkedList<Task> tasks = new LinkedList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			showMenu();
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
            case 1:
                addTaskAtEnd();
                break;

            case 2:
                addTaskAtBeginning();
                break;

            case 3:
                removeFirstTask();
                break;

            case 4:
                removeLastTask();
                break;

            case 5:
                displayTasks();
                break;

            case 6:
                running = false;
                System.out.println("Exiting Task Manager...");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
    sc.close();
}


	static void showMenu() {
		System.out.println("\n=== TASK MANAGER ===");
		System.out.println("1. Add Task at End");
		System.out.println("2. Add Task at Beginning");
		System.out.println("3. Remove First Task");
		System.out.println("4. Remove Last Task");
		System.out.println("5. Display Tasks");
		System.out.println("6. Exit");
		System.out.print("Choice: ");
	}

	static void addTaskAtEnd() {
		System.out.println("Enter task: ");
		String name = sc.nextLine();
		tasks.add(new Task(name));
		System.out.println("Task added at end!");
	}

	static void addTaskAtBeginning() {
		System.out.print("Enter task: ");
		String name = sc.nextLine();
		tasks.addFirst(new Task(name));
		System.out.println("Task added at beginning!");
	}

	static void removeFirstTask() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks to remove!");
			return;
		}
		tasks.removeFirst();
		System.out.println("First task removed!");
	}

	static void removeLastTask() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks to remove!");
			return;
		}
		tasks.removeLast();
		System.out.println("Last task removed!");
	}

	static void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available!");
			return;
		}
		System.out.println("\nYour Tasks:");
		for (Task t : tasks) {
			t.display();
		}
	}
}
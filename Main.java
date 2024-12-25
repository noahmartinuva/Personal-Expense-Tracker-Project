//
// File: Main.java
// Noah Martin
// Date: 12/23
// Description: Handling user interactions and menu navigation.
//

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n=== Personal Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the expense description: ");
                scanner.nextLine();
                String description = scanner.nextLine();
                System.out.print("Enter the expense category (e.g., Food, Transport): ");
                String category = scanner.nextLine();
                System.out.print("Enter the expense amount: ");
                double amount = scanner.nextDouble();
                Expense expense = new Expense(description, category, amount);
                expenses.add(expense);
                System.out.println("Expense added successfully!");
            } else if (choice == 2) {
                if (expenses.isEmpty()) {
                    System.out.println("No expenses recorded yet.");
                } else {
                    System.out.println("\n=== List of Expenses ===");
                    for (Expense expense : expenses) {
                        System.out.println(expense);
                    }
                }
            } else if (choice == 3) {
                double total = 0;
                for (Expense expense : expenses) {
                    total += expense.getAmount();
                }
                System.out.println("Total Expenses: $" + total);
            } else if (choice == 4) {
                System.out.println("Exiting... Thank you for using the expense tracker!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
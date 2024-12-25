//
// File: Expense.java
// Noah Martin
// Date: 12/24
// Description: A class representing an individual expense, includes fields like description, category, and amount.
//

public class Expense {
    private String description;
    private String category;
    private double amount;

    public Expense(String description, String category, double amount) {
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Category: " + category + ", Amount: $" + amount;
    }
}

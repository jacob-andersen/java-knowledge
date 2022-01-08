import java.util.ArrayList;
import java.util.List;

// Compiler version JDK 11.0.2

class Expense {
  // static int Id;
  private String description;
  private double amount;
  private int paymentFrequency;

  public Expense(String description, double amount, int paymentFrequency) {
    this.description = description;
    this.amount = amount;
    this.paymentFrequency = paymentFrequency;
    // Id++;
  }

  public double getWeeklyAmount(Expense expense) {
    return (expense.amount / expense.paymentFrequency);
  }

  public void printExpense(Expense expense) {
    System.out.printf("%-10s %10.2f %11d %21.2f\n", expense.description, expense.amount, expense.paymentFrequency,
        expense.getWeeklyAmount(expense));
  }
  public static void printExpenses(List<Expense> expenses) {
    System.out.println("Expense        Amount       Weeks         Weekly Amount");
    System.out.println("=======================================================");
    double sum = 0;
    for(Expense e : expenses) {
      e.printExpense(e);
      sum+=e.getWeeklyAmount(e);
    }
    System.out.println("=======================================================");
    System.out.printf("Total amount pr. week :  %30.2f\n", sum);
    System.out.println("=======================================================");
  }


  public static void main(String args[]) {
    List<Expense> expenses = new ArrayList<Expense>();

    expenses.add(new Expense("Mortgage", 1690.00, 4));
    expenses.add(new Expense("Food", 125.0, 1));
    expenses.add(new Expense("Cable", 136.0, 4));
    expenses.add(new Expense("Electric", 180, 4));
    expenses.add(new Expense("Gas", 30.0, 4));
    expenses.add(new Expense("T-Mobile", 122.0, 4));
    expenses.add(new Expense("Car Ins.", 217, 4));
    expenses.add(new Expense("Life Ins.", 22.0, 4));
    
    printExpenses(expenses);
  }
}


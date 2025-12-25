package ExpenseTracker;

import java.io.IOException;

public class ExpenseTrackerMain {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();

        try {
            Expense e1 = new Expense("food","Lunch",223240);
            Expense e2 = new Expense("Travel","from Bus",12233);
            Expense e3 = new Expense("Shopping","Clothes",83230);

            manager.addExpense(e1);
            manager.addExpense(e2);
            manager.addExpense(e3);

//Print or Shows Expenses you given at that time
            manager.showExpense();
            System.out.println("-----------------------");
            System.out.println("Total Amount of All Expenses:"+manager.calculateTotalExpense());

            //saves Expenses to file in append mode
            manager.saveToFile();
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

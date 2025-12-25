package ExpenseTracker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExpenseManager {


    //list which can store only objects of Expense Class
    private ArrayList<Expense> expenses=new ArrayList<>();

    // add more elements
    public void addExpense(Expense expense){
        expenses.add(expense);
    }

    // it will show all expenses
    public void showExpense(){
        if (expenses.isEmpty()){
            System.out.println("No Expenses to Show");
            return;
        }

        System.out.println("---- Expense List ----");
        for (Expense exp:expenses){
            System.out.println(exp);
        }

    }public double calculateTotalExpense(){
        double total =0;
        for (Expense exp:expenses){
            total=total+exp.getAmount();
                }
    return total;
        //method which save expenses record in txt file
    }public void saveToFile(){
        try(FileWriter fw = new FileWriter("src/ExpenseTracker/Expenses.txt",true)) {

            fw.write("-----Expenses List-----\n");

            for (Expense exp:expenses){
                fw.write(exp.toString()+"\n");
            }
            fw.write("----------------------");
            fw.write("Total Expense:"+calculateTotalExpense()+" Rs\n\n");
            System.out.println("Expenses Saved to File Successfully");
        }catch (IOException eFW )//exceptionFileWriter){
        {
            System.out.println("Exception Occurred While Writing File:"+eFW.getMessage());
        }
    }
}

package ExpenseTracker;

public class Expense {

    //Encapsulation (data hide)
    private  String category;
    private  String description;
    private  double amount;

    //Constructor (object creation + validation)
    public Expense(String category,String description,double amount){

        if (category==null){
            throw new IllegalArgumentException("Enter valid Category");
        }
        if (amount<0){
            throw new IllegalArgumentException("Enter valid Amount");
        }


        this.category=category;
        this.description=description;
        this.amount=amount;

    }
    //Controlled setters (edit feature)
    public void setCategory(String category){
        if (category==null){
            throw new IllegalArgumentException("Enter Valid Category");
        }
        this.category=category;
    }
    public void setDescription(String description){
if (description==null){
  throw new IllegalArgumentException("Enter Valid Description");
}
        this.description=description;
    }
    public void setAmount(double amount){
        if (amount<0){
            throw new IllegalArgumentException("Enter Valid Expense Amount");
        }
        this.amount=amount;
    }
    //  getter (read only access)
    public double getAmount(){
        return amount;
    }
    public String getCategory(){
        return category;
    }

    public String getDescription() {
        return description;
    }

    @Override // so we can read Output
    public String toString() {
        return "  Category:"+category+
                "  Description:"+description+"  Amount:"+amount;
    }
}

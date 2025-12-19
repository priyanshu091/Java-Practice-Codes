package BankWithdrawalSystem;



import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bank");
        System.out.println("Enter the Balance");
        int bal = input.nextInt();
        System.out.println("Enter Amt to Withdraw:");
        int withd = input.nextInt();
        try {
            System.out.println("Remaining Balance is " + withdraw(bal, withd));
        } catch (InvalidAmtException exc) {
            System.out.println(exc.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Ended");
        }


    }

    public static int withdraw(int bal, int withd) throws InsufficientBalanceException,InvalidAmtException {
        if (withd <= 0 || bal < 0) {

            throw new InvalidAmtException("Please Enter a Valid Amount");
        }
        if (bal < withd) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        System.out.println("Withdraw Successful");
        return bal - withd;
    }
}

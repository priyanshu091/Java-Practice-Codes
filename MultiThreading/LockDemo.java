package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
// 1) creating Bank account class with a lock
class BankAccount {

    private double balance;

    //reEnterant lock Guards bank account as it is "final" so only object state get
    // lock /unlock while object itself never change
    private final ReentrantLock lock = new ReentrantLock();

    //constructor--which set initial balance of new account
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    //getter-- print final balance
    public double getBalance() {
        return balance;
    }

    //deposit using lock() and unlock()
    public void deposit(double amount) {

        lock.lock();

        // using try catch only bcz want to release lock with help of finally block ..
        try {
            //critical section
            System.out.println(Thread.currentThread().getName() + "depositing Rs " + amount);
            balance = balance + amount;
            System.out.println(Thread.currentThread().getName() + "Deposit complete, New Balance is Rs " + balance);
        } catch (Exception e) {
            System.out.println("exception occured in deposit");
        } finally {
            lock.unlock();   // to release the lock
        }
    }

    // creating withdraw() using trylock()

    public void withdraw(double amount) {
        boolean acquiredlock = lock.tryLock();  // it will try to lock instantly

        if (acquiredlock) {

            try {
                System.out.println(Thread.currentThread().getName() + "Withdrawing Rs " + amount);

                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + "Withdrawal complete, New Balance is Rs " + balance);
                } else {
                    System.out.println(Thread.currentThread().getName() + "Not Enough Balance! Current Balance is Rs. " + balance);
                }

            } catch (Exception e) {
                System.out.println("Exception occured in withdrawal");
            } finally {
                lock.unlock();     //Release lock even error occur
            }
        } else {
            // execute when lock was busy ...means this method not got control to lock
            System.out.println(Thread.currentThread().getName() + "Could not withdraw — account is busy right now.");
        }
    }

    // transfer() using tryLock(time, unit)
    public void transfer(double amount, String account) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Transferring Rs " + amount
                + "to " + account);


        boolean acquiredLock = lock.tryLock(2, TimeUnit.SECONDS);


        if (acquiredLock) {
            try {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " Transferred Rs " + amount +
                            " to " + account +
                            "Available balance is Rs" + balance);
                } else {
                    System.out.println(Thread.currentThread().getName()
                            + "  Transfer failed — not enough balance.");
                }

            } finally {
                lock.unlock();

            }

        } else {
            System.out.println(Thread.currentThread().getName()
                    + "  Transfer timed out — account was busy for 2 seconds.");
        }
    }

}


public class LockDemo {
    public static void main(String[] args) throws InterruptedException {


    BankAccount account = new BankAccount(5000);


    //deposit thread
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            account.deposit(1000);
        }
    });

    // Withdraw Thread
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            account.withdraw(500);
        }
    });

    // Transfer Thread
    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                account.transfer(800, "Savings-Account");
            } catch (InterruptedException e) {
                System.out.println("Transfer thread was interrupted.");
            }


        }
    });

        System.out.println("\n── Starting all 3 threads ──\n");

        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();



}}

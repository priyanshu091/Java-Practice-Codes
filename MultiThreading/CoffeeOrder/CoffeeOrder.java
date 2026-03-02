package MultiThreading.CoffeeOrder;

// Runnable interface allows this class to be executed by a Thread
// Think of Runnable as a "task" that we hand over to a Thread to run
public class CoffeeOrder implements Runnable {

    // Each order has a customer name and their drink choice
    private String customerName;
    private String drinkOrder;

    // Constructor: When a customer walks in, we take their name and order
    public CoffeeOrder(String customerName, String drinkOrder) {
        this.customerName = customerName;
        this.drinkOrder = drinkOrder;
    }

    // run() is the HEART of multithreading
    // Whatever code you write here runs INSIDE the thread
    // This method is automatically called when thread.start() is called
    @Override
    public void run() {

        // Step 1: Customer places their order — thread starts executing
        System.out.println(customerName + " placed order: " + drinkOrder);

        try {
            // Step 2: Simulating preparation time (2 seconds)
            // Thread.sleep() PAUSES this thread for 2000 milliseconds
            // Other threads keep running during this pause — that's the magic!
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            // If something forcefully stops this thread mid-sleep, we catch it here
            System.out.println("Unable to place Order");
        }

        // Step 3: After 2 sec sleep, drink is ready — thread finishes its job
        System.out.println(customerName + "'s " + drinkOrder + " is ready!");
    }
}
package MultiThreading.CoffeeOrder;

public class Test {

    public static void main(String[] args) {

        // Step 1: Create the TASKS (Runnable objects)
        // Each CoffeeOrder is just a task, it does not run yet
        // We are just saying Rajat wants Espresso, nothing has started
        CoffeeOrder o1 = new CoffeeOrder("Rajat", "Espresso");
        CoffeeOrder o2 = new CoffeeOrder("Anand", "Latte");
        CoffeeOrder o3 = new CoffeeOrder("Amit", "Cappuccino");

        // Step 2: Create THREADS and assign each task to a thread
        // Thread is the WORKER, CoffeeOrder is the WORK
        // We are handing each order to a separate worker
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        Thread t3 = new Thread(o3);

        // Step 3: START all threads
        // .start() tells the thread to begin working
        // All 3 start SIMULTANEOUSLY, they do not wait for each other
        // Internally .start() calls the run() method of CoffeeOrder
        // NEVER call .run() directly, that won't create a new thread
        t1.start();
        t2.start();
        t3.start();

        // Step 4: Blank line after all orders are placed
        // This line runs on the MAIN thread
        // It may print BEFORE or AFTER the order lines, that is normal
        // Because main thread and t1 t2 t3 are all running at the same time
        System.out.println();

        // Step 5: join() makes main thread WAIT until t1 t2 t3 all finish
        // Without join(), main thread ends immediately after println()
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }


        System.out.println("All orders completed! Coffee Shop is closing...");
    }
}
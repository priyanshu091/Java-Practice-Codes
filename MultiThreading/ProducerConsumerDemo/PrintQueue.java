package MultiThreading.lockUnlock;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {

    private final Queue<String> queue =new LinkedList<>();
    private final int MAX_Capacity = 3;

    //synchronized allow only one thread
    // to enter this method at a time
    public synchronized  void addJob(String jobName) throws InterruptedException {

        while(queue.size() == MAX_Capacity){
            System.out.println(Thread.currentThread().getName()+" waiting - queue is full");
        wait(); // Thread sleep here and release the lock
        }

        queue.add(jobName);
        System.out.println(Thread.currentThread().getName()+" added job: "
                + jobName + "Queue size: "+queue.size());

        notify();  //wake up the printer(print Thread)
    }

    public synchronized  void printJob() throws  InterruptedException {

        while
        (queue.isEmpty()){
            System.out.println("Printer waiting - queue is empty");
            wait(); // printer sleeps here and releases the lock
        }

        String job = queue.poll();

        System.out.println("Printing: "+job+ " Queue size: "
                + queue.size());

        notifyAll(); //notify() wakes only
        // one thread — the others stay stuck forever. notifyAll() is safe.
    }
}

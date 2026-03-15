package MultiThreading.Synchronized;

public class MyThread extends Thread{

    private Counter counter;

    MyThread(Counter counter){

        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {

        counter.increment();
        }
    }
}

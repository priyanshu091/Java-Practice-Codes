package MultiThreading.lockUnlock;

public class Main {
    public static void main(String[] args) {

        PrintQueue printQueue = new PrintQueue();

        // employee threads submitting the jobs
        Runnable employeeTask = () -> {
            for (int i = 1; i <= 3 ; i++) {
                try{
                    String jobName = Thread.currentThread().getName()+" Doc-"+i;
                    printQueue.addJob(jobName);
                    Thread.sleep(200); // time taken in submission

                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Printer Thread consuming Jobs

        Runnable printerTask = () -> {

            for (int i = 0; i < 9; i++) { //print all 9 jobs ( 3 employees x 3)

                try{
                    printQueue.printJob();
                    Thread.sleep(500); //time taken in printing
                }catch (Exception e){
                    Thread.currentThread().interrupt();
                }

            }
        };

        Thread emp1 = new Thread(employeeTask, "Aman");
        Thread emp2 = new Thread(employeeTask,"Amit");
        Thread emp3 = new Thread(employeeTask,"Rajat");

        Thread printer = new Thread(printerTask,"Printer");

        emp1.start();
        emp2.start();
        emp3.start();
        printer.start();
    }
}

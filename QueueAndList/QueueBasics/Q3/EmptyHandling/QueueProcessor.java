package QueueAndList.QueueBasics.Q3.EmptyHandling;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProcessor {

   private Queue<Item> queueProcess;

    public QueueProcessor() {
        queueProcess=new LinkedList<>();
    }
    public void addItem(Item item){
        queueProcess.offer(item);
        System.out.println("Item Successfully Added to Queue "+item.getItemName());

    }
    public void processQueue(){
        System.out.println("=".repeat(50)+" Processing Queue"+"=".repeat(50));


        if (queueProcess.isEmpty()) {
            System.out.println("Queue is Empty, Nothing to Process");


                return;
        }

            int processedCount = 0;
            System.out.println("=".repeat(50) + "Processing Items" + "=".repeat(50));

        while(!queueProcess.isEmpty()){

            Item itemProcess = queueProcess.poll();

            if (itemProcess!=null){

                processedCount++;

                System.out.println("Processed item "+processedCount+": "+itemProcess);
            }

        }
            System.out.println("-".repeat(50));
            System.out.println("\n All items successfully processed!");
            System.out.println(" Total Items Processed: " + processedCount);
            System.out.println(" Queue Status: "+(queueProcess.isEmpty()?"Empty":"Has Item"));
            System.out.println("=".repeat(50));

        }
        public void showQueueStatus()
        {
        System.out.println("=".repeat(50)+"Current Queue Status"+"=".repeat(50));

        if (queueProcess.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else {
            int position=1;
            System.out.println("Items in Queue are :-");

            for (Item item :queueProcess){
                System.out.println(position+". "+item);
                position++;
            }
            System.out.println("=".repeat(50));
        }
    }

    }


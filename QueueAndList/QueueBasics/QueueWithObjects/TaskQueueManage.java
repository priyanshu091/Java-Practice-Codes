package QueueAndList.QueueBasics.QueueWithObjects;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueueManage {



   private Queue<Task> taskQueue;

TaskQueueManage(){
    taskQueue=new LinkedList<>();
}

    public void addTask(Task task){
        if (taskQueue.offer(task)){
            System.out.println(task);
            System.out.println("Task Added");
            return;
        }else {
            System.out.println("Task Not Added");
            return;
        }

    }
    public void completeTask(){
        if (taskQueue.isEmpty()){
            System.out.println("Please Assign Task First , then Try to Complete them");
            return;
        }
        System.out.printf("-------Task Completed-------\n%s ",taskQueue.poll());
    }
    public void showPending(){
        if (taskQueue.isEmpty()){
            System.out.println("Showing Pending Tasks");
            System.out.println("No task to show");
            return;
        }
        else{
            System.out.println("\n---------Showing Pending Tasks---------");
        for (Task task : taskQueue) {
            System.out.println(task);
            System.out.println();
        }}
    }
}

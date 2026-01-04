package QueueAndList.QueueBasics.QueueWithObjects;

public class TestTaskQueue {
    public static void main(String[] args) {
       TaskQueueManage tqManage= new TaskQueueManage();

       Task t1 = new Task(1,"Study");
       Task t2 = new Task(2,"Reading");
       Task t3 = new Task(3, "Coding");


       tqManage.addTask(t1);
       tqManage.addTask(t2);
       tqManage.addTask(t3);

       tqManage.completeTask();
tqManage.showPending();
    }
}

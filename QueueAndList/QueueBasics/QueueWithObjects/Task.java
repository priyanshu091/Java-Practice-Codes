package QueueAndList.QueueBasics.QueueWithObjects;

public class Task {
    private int taskID;
    private String taskName;

    Task(int taskID,String taskName){
        this.taskID=taskID;
        this.taskName=taskName;
    }
    public int getTaskID(){
        return taskID;
    }
    public String getTaskName(){
        return taskName;
    }

    @Override
    public String toString() {
        return "----------Task----------" +
                "\nTask ID= " + taskID +
                "\nTask Name= " + taskName;
    }
}

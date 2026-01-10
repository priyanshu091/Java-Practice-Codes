package CombinedArrayAndQueue.Q6OrderManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ManageOrders {

    List<Order> orderList;
    Queue<Order> orderQueue;

    public ManageOrders(){
        orderList=new ArrayList<>();
        orderQueue=new LinkedList<>();

    }

    public void placeOrder(Order order){
        System.out.println("=".repeat(25)+"Placing Order"+"=".repeat(25));
        if (orderQueue.offer(order)){

            System.out.println(order+"\n Successfully Added");
        }
        else {
            System.out.println("unable to add order");
        }
        System.out.println("=".repeat(25)+"=".repeat(25));

    }
    public void processOrder(){
        System.out.println("=".repeat(25)+"Processing Order"+"=".repeat(25));

        if (orderQueue.isEmpty()){
            System.out.println("No pending orders to process");
        }
        else {
          Order o= orderQueue.poll();
            orderList.add(o);
            System.out.println("Processed Order:"+o);
        }
        System.out.println("=".repeat(25)+"=".repeat(25));
    }
    public void showPending(){

        System.out.println("=".repeat(25)+"Showing Pending Orders"+"=".repeat(25));
       int index=1;
        for (Order o : orderQueue) {
           System.out.println(index+"."+o);
           index++;
        }
        System.out.println("=".repeat(25)+"=".repeat(25));
    }
    public void showCompleted(){
        System.out.println("=".repeat(25)+"Completed Orders"+"=".repeat(25));
        int index=0;

        while(index<orderList.size()){

            System.out.println((index+1)+"."+orderList.get(index));
       index++;
        }
        System.out.println("=".repeat(25)+"=".repeat(25));
    }
}

package QueueAndList.QueueBasics.QueueSimpleOperations;

import java.util.LinkedList;
import java.util.Queue;

public class NumberQueue {

    Queue<Integer> numbers=new LinkedList<>();

    public void addNumber(int num){

        numbers.offer(num);
    }
    public void removeNumber(){
        if (numbers.isEmpty()){
        System.out.printf("%d is removed",numbers.poll());
        return;
    }}
    public void showFront(){
        if (numbers.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(numbers.peek());
    }
    public void showAll(){
        if (numbers.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }else {
        for (Integer index : numbers) {
            System.out.print(index+" ");
        }}


    }
}

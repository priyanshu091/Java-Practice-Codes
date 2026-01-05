package QueueAndList.QueueBasics.Q3.EmptyHandling;

public class TestQueueProcessor {

    public static void main(String[] args) {

        Item i1= new Item("001","Apple");
        Item i2 = new Item("002","Corn Flakes");
        Item i3 = new Item("003","Oats");

        QueueProcessor qp1= new QueueProcessor();

        qp1.addItem(i1);
        qp1.addItem(i2);
        qp1.addItem(i3);

qp1.showQueueStatus();
qp1.processQueue();
qp1.showQueueStatus();

    }
}

package CombinedArrayAndQueue.Q6OrderManagementSystem;

public class TestOrder {
    public static void main(String[] args) {





   ManageOrders mo = new ManageOrders();

   mo.placeOrder(new Order("101", "Priyanshu"));
   mo.placeOrder(new Order("102", "Ansh"));
   mo.placeOrder(new Order("103", "Deepanshu"));

mo.processOrder();
mo.processOrder();

mo.showPending();

mo.showCompleted();
    }

}

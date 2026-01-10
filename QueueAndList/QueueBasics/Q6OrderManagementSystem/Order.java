package CombinedArrayAndQueue.Q6OrderManagementSystem;

public class Order {

    private String orderId;
    private String customerName;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "\nOrder ID:"+orderId+
                "\nCustomer Name:"+customerName;
    }
}


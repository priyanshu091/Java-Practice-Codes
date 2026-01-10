# Order Management System

A simple Java application demonstrating Queue and ArrayList usage for managing order workflows.

## Overview

This project simulates a basic order processing system where orders are placed in a queue, processed one-by-one (FIFO), and stored in a list once completed.

## Project Structure

```
CombinedArrayAndQueue/Q6OrderManagementSystem/
├── Order.java
├── ManageOrders.java
└── TestOrder.java
```

## Features

- **Place Order**: Add new orders to pending queue
- **Process Order**: Move order from queue to completed list
- **Show Pending**: Display all orders waiting to be processed
- **Show Completed**: Display all processed orders

## Classes

### Order.java
```java
public class Order {
    private String orderId;
    private String customerName;
}
```

### ManageOrders.java
```java
public class ManageOrders {
    List<Order> orderList;      // Completed orders
    Queue<Order> orderQueue;    // Pending orders
}
```

## Usage

```java
ManageOrders mo = new ManageOrders();

// Place orders
mo.placeOrder(new Order("101", "Priyanshu"));
mo.placeOrder(new Order("102", "Ansh"));
mo.placeOrder(new Order("103", "Deepanshu"));

// Process orders
mo.processOrder();
mo.processOrder();

// Display status
mo.showPending();    // Shows 1 order
mo.showCompleted();  // Shows 2 orders
```

## Key Learnings

### Queue Operations
- `offer()` - Add element to queue
- `poll()` - Remove and return head element
- `isEmpty()` - Check if queue is empty

### ArrayList Operations
- `add()` - Add element to list
- `get(index)` - Access element by index
- `size()` - Get list size

### Common Mistakes Fixed

#### 1. Double poll() Bug
**Wrong:**
```java
Order o = orderQueue.poll();
orderList.add(orderQueue.poll());  // ❌ Polls twice!
```

**Correct:**
```java
Order o = orderQueue.poll();
orderList.add(o);  // ✅ Uses same object
```

#### 2. Wrong Empty Check
**Wrong:**
```java
if (orderList.add(orderQueue.poll())) {  // ❌ Always true
```

**Correct:**
```java
if (orderQueue.isEmpty()) {  // ✅ Check queue first
    // handle empty case
}
```

#### 3. Shallow Copy in Display
**Wrong:**
```java
Queue queCopy = orderQueue;  // ❌ Same reference
queCopy.poll();  // Modifies original!
```

**Correct:**
```java
for (Order o : orderQueue) {  // ✅ No modification
    System.out.println(o);
}
```

#### 4. Missing Loop Increment
**Wrong:**
```java
for (Order o : orderQueue) {
    System.out.println(bullets + "." + o);
    // ❌ bullets++ missing
}
```

**Correct:**
```java
for (Order o : orderQueue) {
    System.out.println(bullets + "." + o);
    bullets++;  // ✅ Increment counter
}
```

## Why This Matters

- **FIFO Principle**: First order placed is first order processed
- **Data Structures**: Right tool for the right job (Queue for pending, List for history)
- **Real-World Application**: E-commerce, ticketing systems, restaurant orders

## How to Run

```bash
javac CombinedArrayAndQueue/Q6OrderManagementSystem/*.java
java CombinedArrayAndQueue.Q6OrderManagementSystem.TestOrder
```

## Sample Output

```
=========================Placing Order=========================
Order ID: 101
Customer Name: Priyanshu
Successfully Added
==============================================================

=========================Processing Order======================
Processed Order:
Order ID: 101
Customer Name: Priyanshu
==============================================================

=========================Showing Pending Orders================
1. Order ID: 103
   Customer Name: Deepanshu
==============================================================

=========================Completed Orders======================
1. Order ID: 101
   Customer Name: Priyanshu
2. Order ID: 102
   Customer Name: Ansh
==============================================================
```

## Future Enhancements

- [ ] Add order priority levels
- [ ] Implement order cancellation
- [ ] Add timestamps
- [ ] Search orders by ID

---

**Learning in Public** - Building strong fundamentals through hands-on practice! 💪
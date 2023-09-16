package ro.fasttrackit.composition;

import java.util.Arrays;

class OnlineOrder implements Order {
    private final OrderInfo order;
    private final int orderNumber;
    private final String address;
    private final String customerName;

    public OnlineOrder(OrderInfo order, int orderNumber, String address, String customerName) {
        this.order = order;
        this.orderNumber = orderNumber;
        this.address = address;
        this.customerName = customerName;
    }

    @Override
    public String orderedBy() {
        return this.customerName;
    }

    @Override
    public String orderInfo() {
        return String.format("Contents: %s, Order Number: %s, Address: %s, Total Price: %.2f", Arrays.toString(this.order.items()), this.orderNumber, this.address, this.order.totalPrice());
    }
}
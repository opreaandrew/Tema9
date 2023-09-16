package ro.fasttrackit.composition;

import java.util.Arrays;

class OnPremiseOrder implements Order {
    private final OrderInfo order;
    private final int tableNumber;
    private final int noOfCustomers;

    public OnPremiseOrder(OrderInfo order, int tableNumber, int noOfCustomers) {
        this.order = order;
        this.tableNumber = tableNumber;
        this.noOfCustomers = noOfCustomers;
    }


    public String orderedBy() {
        return "On-Premise Table: " + this.tableNumber;
    }

    public String orderInfo() {
        return String.format("Contents: %s,Table Number: %s, Number of Customers: %s, Total Price: %.2f", Arrays.toString(this.order.items()), this.tableNumber, this.noOfCustomers, order.totalPrice());
    }
}

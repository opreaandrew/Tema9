package ro.fasttrackit.composition;

public class Restaurant {
    private final String name;
    private final Order[] orders;

    public Restaurant(String name, Order[] orders) {
        this.name = name;
        this.orders = orders;
    }

    public void handleOrders() {
        for (Order order : orders) {
            order.processOrder();
            System.out.println("\n=====");
        }
    }

    public String getName() {
        return name;
    }
}

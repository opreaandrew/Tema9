package ro.fasttrackit.composition;

public class Main {
    public static void main(String[] args) {
        OrderInfo onlineOrderInfo = new OrderInfo(new String[]{"Pizza", "Burger"}, 25.99);
        OrderInfo onPremiseOrderInfo = new OrderInfo(new String[]{"Steak", "Salad"}, 42.50);

        Order onlineOrder = new OnlineOrder(onlineOrderInfo, 101, "Fat Street", "Gigel");
        Order onPremiseOrder = new OnPremiseOrder(onPremiseOrderInfo, 5, 4);

        Order[] orders = {onlineOrder, onPremiseOrder};

        Restaurant restaurant = new Restaurant("Fat Food", orders);
        restaurant.handleOrders();

    }
}
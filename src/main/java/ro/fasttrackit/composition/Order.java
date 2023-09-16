package ro.fasttrackit.composition;

interface Order {
    String orderedBy();
    String orderInfo();
    default void processOrder(){
        System.out.printf("This order belongs to: %s \n It consists of: %s ",orderedBy(), orderInfo());
    }
}
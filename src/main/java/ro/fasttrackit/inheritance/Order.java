package ro.fasttrackit.inheritance;

public abstract class Order {
    public String orderedBy(){
        return "";
    }
    public String orderInfo(){
        return "";
    }
    public void processOrder(){
        System.out.printf("This order belongs to: %s \n It consists of: %s ",orderedBy(), orderInfo());
    }
}

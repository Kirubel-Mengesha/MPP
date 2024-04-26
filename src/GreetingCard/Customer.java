package GreetingCard;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private int age;
    private boolean subscribed;
    private boolean annualChristmasCardSubscription;
    List<Order> orderList;

    public Customer(String name, String address, int age, boolean subscribed,boolean annualChristmasCardSubscription) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.subscribed = subscribed;
        this.annualChristmasCardSubscription = annualChristmasCardSubscription;
        orderList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}

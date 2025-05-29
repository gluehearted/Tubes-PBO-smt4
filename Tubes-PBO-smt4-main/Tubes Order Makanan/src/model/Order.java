package model;

import java.util.List;

public class Order {
    private Customer customer;
    private List<MenuItem> items;
    private double totalAmount;

    public Order(Customer customer, List<MenuItem> items, double totalAmount) {
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

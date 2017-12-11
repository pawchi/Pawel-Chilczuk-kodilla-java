package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public User user;
    public OrderDate orderDate;
    public Product product;

    public OrderRequest(User user, OrderDate orderDate, Product product) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public OrderDate getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }
}

package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User ("Jan","Kowalski","Janek_26");
        OrderDate orderDate = new OrderDate (20171210);
        Product product = new Product("Rubic Cube",3);


        return new OrderRequest(user, orderDate, product);
    }
}

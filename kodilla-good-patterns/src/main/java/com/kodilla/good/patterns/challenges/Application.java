package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        //OrderRequest orderRequest = new OrderRequest();

        orderRequestRetriever.retrieve();
    }
}

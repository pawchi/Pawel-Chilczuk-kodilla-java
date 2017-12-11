package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new OrderInfoService(), new OrderRepositorySender(), new ProductOrderService());
        orderProcessor.process(orderRequest);

    }
}

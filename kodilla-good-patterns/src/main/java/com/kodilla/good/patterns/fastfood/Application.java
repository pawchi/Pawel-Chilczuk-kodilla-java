package com.kodilla.good.patterns.fastfood;

public class Application {
    public static void main(String[] args) {

        RequestProcessor requestProcessor = new RequestProcessor(new SupplierRequestRetriever());
        requestProcessor.checkRequestCornfirmation();
    }
}

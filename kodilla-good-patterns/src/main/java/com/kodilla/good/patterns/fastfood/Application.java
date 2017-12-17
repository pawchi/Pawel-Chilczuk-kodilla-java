package com.kodilla.good.patterns.fastfood;

public class Application {
    public static void main(String[] args){
        SupplierRequestRetriever supplierRequestRetriever = new SupplierRequestRetriever();
        SupplierRequest supplierRequest = supplierRequestRetriever.retrieve();

        RequestProcessor requestProcessor = new RequestProcessor(supplierRequestRetriever.retrieve().producer);
        requestProcessor.checkRequestCornfirmation(supplierRequest);
    }
}

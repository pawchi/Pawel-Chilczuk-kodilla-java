package com.kodilla.good.patterns.fastfood;

public class Application {
    public static void main(String[] args){
        SupplierRequestRetriever supplierRequestRetriever = new SupplierRequestRetriever();
        SupplierRequest supplierRequest = supplierRequestRetriever.retrieve();

        SupplierRequestProcessor supplierRequestProcessor = new SupplierRequestProcessor();

        RequestProcessor requestProcessor = new RequestProcessor(new KebabMaster());
        requestProcessor.checkRequestConfirmation(supplierRequestProcessor.createRequestQue(supplierRequest));
    }
}

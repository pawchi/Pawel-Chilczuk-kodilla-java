package com.kodilla.good.patterns.fastfood;

public class RequestProcessor {

    private RequestRetriever requestRetriever;

    public RequestProcessor(final RequestRetriever requestRetriever) {
        this.requestRetriever = requestRetriever;
    }

    public RequestDto checkRequestCornfirmation( ) {

        SupplierRequest supplierRequest1 = requestRetriever.retrieve();
        Producer producer = supplierRequest1.getProducer();

        boolean isConfirmed = producer.process(supplierRequest1);
        if (isConfirmed) {
            System.out.println("\nRequest successfully confirmed by producer :" + producer.getClass().getSimpleName());
            return new RequestDto(supplierRequest1, true);
        } else {
            System.out.println("\nRequest not confirmed by any producer.");
            return new RequestDto(supplierRequest1, false);
        }
    }
}

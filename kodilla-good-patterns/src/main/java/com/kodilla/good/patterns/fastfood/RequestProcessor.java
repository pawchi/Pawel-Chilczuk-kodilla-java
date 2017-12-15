package com.kodilla.good.patterns.fastfood;

public class RequestProcessor {
    public Producer producer;

    public RequestProcessor(Producer producer) {
        this.producer = producer;
    }

    public RequestDto  checkRequestConfirmation(SupplierRequest supplierRequest){

        boolean isConfirmed = producer.process(supplierRequest);
                if(isConfirmed) {
                    System.out.println("\nRequest successfully confirmed by producer :"+supplierRequest.producer.getClass().getSimpleName());
            return new RequestDto(supplierRequest.getProducer(),true);
                } else {
                    System.out.println("\nRequest not confirmed by any producer.");
                    return new RequestDto(supplierRequest.getProducer(),false);
                }
    }
}

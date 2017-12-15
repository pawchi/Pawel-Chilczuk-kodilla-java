package com.kodilla.good.patterns.fastfood;

public class RequestProcessor {
    public Producer producer;

    public RequestDto  checkRequestConfirmation(SupplierRequest supplierRequest){

        boolean isConfirmed = producer.process(supplierRequest);
                if(isConfirmed) {
                    System.out.println("Request successfully confirmed by producer :"+supplierRequest.getProducer());
            return new RequestDto(supplierRequest.getProducer(),true);
                } else {
                    System.out.println("Request not confirmed by any producer.");
                    return new RequestDto(supplierRequest.getProducer(),false);
                }
    }
}

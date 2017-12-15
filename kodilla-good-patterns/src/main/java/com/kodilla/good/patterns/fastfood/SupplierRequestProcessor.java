package com.kodilla.good.patterns.fastfood;

import java.util.ArrayDeque;

public class SupplierRequestProcessor {

    public SupplierRequest createRequestQue(SupplierRequest supplierRequest){

        ArrayDeque<SupplierRequest> requestsStock = new ArrayDeque<>();
        requestsStock.offer((supplierRequest));

        return requestsStock.poll();
    }
}

package com.kodilla.good.patterns.fastfood;

public class KebabMaster implements Producer {
    @Override
    public boolean process(SupplierRequest supplierRequest){
        System.out.println("KebabMaster confirms request for product:"+supplierRequest.getProduct()+"; and quantity :"+supplierRequest.getProductParameters());
        return true;
    }
}

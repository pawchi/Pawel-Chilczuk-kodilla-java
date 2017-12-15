package com.kodilla.good.patterns.fastfood;

public class DreamBurger implements Producer {
    @Override
    public boolean process(SupplierRequest supplierRequest){
        System.out.println("DreamBurger confirms request for product:"+supplierRequest.getProduct()+"; and quantity :"+supplierRequest.getProductParameters());
        return true;
    }
}

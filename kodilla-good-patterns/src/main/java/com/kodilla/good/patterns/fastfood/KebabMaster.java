package com.kodilla.good.patterns.fastfood;

public class KebabMaster implements Producer {
    @Override
    public boolean process(SupplierRequest supplierRequest){
        System.out.println("KebabMaster confirms request for product:"+"\n"+supplierRequest.getProduct().getProductName()+"\nquantity :"+supplierRequest.getProductParameters().getProductQuantity());
        System.out.println("Product size :"+supplierRequest.getProductParameters().getProductSize());
        System.out.println("Special comments :"+supplierRequest.getProductParameters().getComments());

        return true;
    }
}

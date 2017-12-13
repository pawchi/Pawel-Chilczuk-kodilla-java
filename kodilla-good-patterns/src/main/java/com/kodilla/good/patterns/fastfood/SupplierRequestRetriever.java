package com.kodilla.good.patterns.fastfood;

public class SupplierRequestRetriever {
    public SupplierRequest retrieve(){
        Supplier supplier = new Supplier("Lunch Taxi",1);
        Product product = new Product("Chickenburger",12,3);

        return new SupplierRequest(supplier,product);
    }
}

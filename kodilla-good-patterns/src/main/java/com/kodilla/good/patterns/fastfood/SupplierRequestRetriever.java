package com.kodilla.good.patterns.fastfood;

public class SupplierRequestRetriever {
    public SupplierRequest retrieve(){
        ProductID id1 = new ProductID(1);
        Product product = new Product("Chickenburger",id1);
        ProductParameters productParameters = new ProductParameters(2,"XL","Without onion");
        Producer dreamBurger = new DreamBurger();

        return new SupplierRequest(productParameters,product,dreamBurger);
    }
}

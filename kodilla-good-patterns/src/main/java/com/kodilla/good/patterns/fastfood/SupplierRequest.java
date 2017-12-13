package com.kodilla.good.patterns.fastfood;

public class SupplierRequest {
    public Supplier supplier;
    public Product product;

    public SupplierRequest(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}

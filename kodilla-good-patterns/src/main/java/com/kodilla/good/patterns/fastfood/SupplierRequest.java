package com.kodilla.good.patterns.fastfood;

public class SupplierRequest {
    public ProductParameters productParameters;
    public Product product;
    public Producer producer;

    public SupplierRequest(ProductParameters productParameters, Product product, Producer producer) {
        this.productParameters = productParameters;
        this.product = product;
        this.producer = producer;
    }

    public ProductParameters getProductParameters() {
        return productParameters;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }

}





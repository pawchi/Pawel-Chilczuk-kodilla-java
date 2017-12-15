package com.kodilla.good.patterns.fastfood;

public class Product {
    public String productName;
    public ProductID productID;

    public Product(String productName, ProductID productID) {
        this.productName = productName;
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public ProductID getProductID() {
        return productID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productID=" + productID +
                '}';
    }
}

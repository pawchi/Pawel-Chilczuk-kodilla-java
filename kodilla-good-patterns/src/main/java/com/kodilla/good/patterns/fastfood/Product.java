package com.kodilla.good.patterns.fastfood;

public class Product {
    public String productName;
    public Integer productID;
    public Integer productQuantity;

    public Product(String productName, Integer productID, Integer productQuantity) {
        this.productName = productName;
        this.productID = productID;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductID() {
        return productID;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }
}

package com.kodilla.good.patterns.fastfood;

public class ProductParameters {
    public Integer productQuantity;
    public String productSize;
    public String comments;

    public ProductParameters(Integer productQuantity, String productSize, String comments) {
        this.productQuantity = productQuantity;
        this.productSize = productSize;
        this.comments = comments;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public String getProductSize() {
        return productSize;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "ProductParameters{" +
                "productQuantity=" + productQuantity +
                ", productSize='" + productSize + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}

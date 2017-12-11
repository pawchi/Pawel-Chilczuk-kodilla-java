package com.kodilla.good.patterns.challenges;

public class Product {
    public String itemName;
    public int quantity;

    public Product(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}

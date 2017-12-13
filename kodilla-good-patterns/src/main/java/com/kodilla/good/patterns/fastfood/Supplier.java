package com.kodilla.good.patterns.fastfood;

public class Supplier {
    public String supplierName;
    public Integer supplierID;

    public Supplier(String supplierName, Integer supplierID) {
        this.supplierName = supplierName;
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Integer getSupplierID() {
        return supplierID;
    }
}

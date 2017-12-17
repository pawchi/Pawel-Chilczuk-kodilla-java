package com.kodilla.good.patterns.fastfood;

public class RequestDto {
    public SupplierRequest supplierRequest;
    public boolean isConfirmed;

    public RequestDto(SupplierRequest supplierRequest, boolean isConfirmed) {
        this.supplierRequest = supplierRequest;
        this.isConfirmed = isConfirmed;
    }
}




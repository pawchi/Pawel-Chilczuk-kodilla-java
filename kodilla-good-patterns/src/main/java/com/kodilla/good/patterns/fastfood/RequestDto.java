package com.kodilla.good.patterns.fastfood;

public class RequestDto {
    public Producer producer;
    public boolean isConfirmed;

    public RequestDto(Producer producer, boolean isConfirmed) {
        this.producer = producer;
        this.isConfirmed = isConfirmed;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}

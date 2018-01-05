package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        ConnectionProcessor connectionProcessor = new ConnectionProcessor();
        ConnectionRequestRetriever connectionRequestRetriever = new ConnectionRequestRetriever();

        connectionProcessor.connectionToCity(connectionRequestRetriever.retrieve());
        connectionProcessor.connectionFromCity(connectionRequestRetriever.retrieve());
        connectionProcessor.connectionToCityViaCity(connectionRequestRetriever.retrieve());
    }
}
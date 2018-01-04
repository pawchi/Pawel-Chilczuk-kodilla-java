package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        ConnectionDB connectionDB = new ConnectionDB();
        ConnectionProcessor connectionProcessor = new ConnectionProcessor(connectionDB);
        ConnectionRequestRetriever connectionRequestRetriever = new ConnectionRequestRetriever();

        //connectionProcessor.connectionToCity(connectionRequestRetriever.retrieve());
        //connectionProcessor.connectionFromCity(connectionRequestRetriever.retrieve());
        connectionProcessor.connectionToCityViaCity(connectionRequestRetriever.retrieve());
    }
}
package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectionProcessor {

    ConnectionDB connectionDB;

    public ConnectionProcessor(ConnectionDB connectionDB) {
        this.connectionDB = connectionDB;
    }

    public ConnectionDB getConnectionDB() {
        return connectionDB;
    }


    public List<Flight> connectionToCity(ConnectionRequest connectionRequest){

        List<Flight> toAirport;
        toAirport = connectionDB.getConnection().stream()
                .filter(a -> a.arrivalCity.equals(connectionRequest.destinationCity))
                .collect(Collectors.toList());
        System.out.println("All possible flights to city: "+connectionRequest.destinationCity);

        toAirport.stream()
                .forEach(System.out::println);

        return new ArrayList<>(toAirport);
    }



    public List<Flight> connectionFromCity(ConnectionRequest connectionRequest){
        List<Flight> fromAirport;
        fromAirport = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.startCity))
                .collect(Collectors.toList());

        System.out.println("\n\nAll possible flights from city: "+connectionRequest.startCity);

        fromAirport.stream()
                .forEach(System.out::println);

        return  new ArrayList<>(fromAirport);
    }



    public List<Flight> connectionToCityViaCity (ConnectionRequest connectionRequest){
        List<Flight> toCityViaCity;

        toCityViaCity = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.startCity))
                .filter(a -> a.arrivalCity.equals(connectionRequest.viaCity))
                .collect(Collectors.toList());


        toCityViaCity = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.viaCity))
                .filter(a -> a.arrivalCity.equals(connectionRequest.destinationCity))
                .collect(Collectors.toList());

        System.out.println("\n\nAll possible flights from city: "+connectionRequest.startCity+" to city: "+connectionRequest.destinationCity+" via city: "+connectionRequest.viaCity);

        toCityViaCity.stream()
                .forEach(System.out::println);

        return new ArrayList<>(toCityViaCity);
        }
    }

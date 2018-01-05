package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectionProcessor {

    ConnectionDB connectionDB;

    public List<Flight> connectionToCity(ConnectionRequest connectionRequest){
        List<Flight> toAirport;

        toAirport = connectionDB.getConnection().stream()
                .filter(a -> a.arrivalCity.equals(connectionRequest.destinationCity))
                .collect(Collectors.toList());

        if(toAirport.size()>0){
            System.out.println("All possible flights to city: "+connectionRequest.destinationCity);
            toAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\n\nNo flights found for requested connection");
        }
        return new ArrayList<>(toAirport);
    }


    public List<Flight> connectionFromCity(ConnectionRequest connectionRequest){
        List<Flight> fromAirport;

        fromAirport = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.startCity))
                .collect(Collectors.toList());

        if(fromAirport.size()>0) {
            System.out.println("\n\nAll possible flights from city: " + connectionRequest.startCity);
            fromAirport.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\n\nNo flights found for requested connection");
        }
        return  new ArrayList<>(fromAirport);
    }


    public List<Flight> connectionToCityViaCity (ConnectionRequest connectionRequest){
        List<Flight> toViaCity;
        List<Flight> fromViaCity;

        toViaCity = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.startCity))
                .filter(a -> a.arrivalCity.equals(connectionRequest.viaCity))
                .collect(Collectors.toList());

        fromViaCity = connectionDB.getConnection().stream()
                .filter(a -> a.departureCity.equals(connectionRequest.viaCity))
                .filter(a -> a.arrivalCity.equals(connectionRequest.destinationCity))
                .collect(Collectors.toList());

        toViaCity.addAll(fromViaCity);

        if(toViaCity.size()>0 && fromViaCity.size()>0) {
            System.out.println("\n\nAll possible flights from city: " + connectionRequest.startCity + " to city: " + connectionRequest.destinationCity + " via city: " + connectionRequest.viaCity);
            toViaCity.stream()
                    .forEach(System.out::println);
        } else {
            System.out.println("\n\nNo flights found for requested connection");
        }
        return new ArrayList<>(toViaCity);
        }
    }

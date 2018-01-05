package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public final class ConnectionDB {

    public static List<Flight> getConnection(){

        final List<Flight> allConnections = new ArrayList<>();

        allConnections.add(new Flight("A1","Berlin","Rome", LocalDateTime.of(2018,1,10,8,20),LocalDateTime.of(2018,1,10,10,30)));
        allConnections.add(new Flight("A2","Berlin","London", LocalDateTime.of(2018,1,10,8,50),LocalDateTime.of(2018,1,10,10,10)));
        allConnections.add(new Flight("A3","Berlin","Moscow", LocalDateTime.of(2018,1,10,7,0),LocalDateTime.of(2018,1,10,9,30)));
        allConnections.add(new Flight("A4","London","Rome", LocalDateTime.of(2018,1,10,9,20),LocalDateTime.of(2018,1,10,11,40)));
        allConnections.add(new Flight("A5","London","Berlin", LocalDateTime.of(2018,1,10,12,20),LocalDateTime.of(2018,1,10,13,50)));
        allConnections.add(new Flight("A6","London","Moscow", LocalDateTime.of(2018,1,10,7,30),LocalDateTime.of(2018,1,10,10,30)));
        allConnections.add(new Flight("A7","Moscow","Rome", LocalDateTime.of(2018,1,10,8,20),LocalDateTime.of(2018,1,10,10,30)));
        allConnections.add(new Flight("A8","Moscow","Berlin", LocalDateTime.of(2018,1,10,8,20),LocalDateTime.of(2018,1,10,10,30)));
        allConnections.add(new Flight("A9","Moscow","London", LocalDateTime.of(2018,1,10,8,20),LocalDateTime.of(2018,1,10,10,30)));
        allConnections.add(new Flight("A10","Rome","London", LocalDateTime.of(2018,1,10,8,20),LocalDateTime.of(2018,1,10,10,30)));

        return new ArrayList<>(allConnections);
    }
}

package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class ConnectionRequest {
    public String name;
    public String startCity;
    public String destinationCity;
    public String viaCity;
    public LocalDateTime startDateTime;

    public ConnectionRequest(String name, String startCity, String destinationCity, String viaCity, LocalDateTime startDateTime) {
        this.name = name;
        this.startCity = startCity;
        this.destinationCity = destinationCity;
        this.viaCity = viaCity;
        this.startDateTime = startDateTime;
    }

    public String getName() {
        return name;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public String getViaCity() {
        return viaCity;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }
}

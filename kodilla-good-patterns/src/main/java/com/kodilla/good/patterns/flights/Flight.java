package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public final class Flight {

    public String flightNumber;
    public String departureCity;
    public String arrivalCity;
    public LocalDateTime departureTime;
    public LocalDateTime arrivalTime;


    public Flight( String flightNumber, String departureCity, String arrivalCity, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}






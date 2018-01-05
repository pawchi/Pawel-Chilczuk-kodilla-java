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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightNumber != null ? !flightNumber.equals(flight.flightNumber) : flight.flightNumber != null)
            return false;
        if (departureCity != null ? !departureCity.equals(flight.departureCity) : flight.departureCity != null)
            return false;
        if (arrivalCity != null ? !arrivalCity.equals(flight.arrivalCity) : flight.arrivalCity != null) return false;
        if (departureTime != null ? !departureTime.equals(flight.departureTime) : flight.departureTime != null)
            return false;
        return arrivalTime != null ? arrivalTime.equals(flight.arrivalTime) : flight.arrivalTime == null;
    }

    @Override
    public int hashCode() {
        int result = flightNumber != null ? flightNumber.hashCode() : 0;
        result = 31 * result + (departureCity != null ? departureCity.hashCode() : 0);
        result = 31 * result + (arrivalCity != null ? arrivalCity.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        return result;
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






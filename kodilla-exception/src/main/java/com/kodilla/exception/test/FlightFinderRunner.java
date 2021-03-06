package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args){
        Flight flight1 = new Flight("London","Frankfurt");
        Flight flight2 = new Flight("London","Paris");

        try {
            FlightFinder run = new FlightFinder();
            run.findFlight(flight2);
        } catch (RouteNotFoundException e) {System.out.println("This airport is not available  :"+e);
        }
    }
}

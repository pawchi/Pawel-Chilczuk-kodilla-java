package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args){
        Flight flight1 = new Flight("London","Frankfurt");
        Flight flight2 = new Flight("London","Paris");
        Flight flight3 = new Flight("XXX","Frankfurt");



        try {
            FlightFinder run = new FlightFinder();
            run.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("My Exception");
        }
    }
}

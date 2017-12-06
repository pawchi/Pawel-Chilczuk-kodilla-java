package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean> flightsMap = new HashMap<>();
        flightsMap.put("London",true);
        flightsMap.put("Frankfurt",true);
        flightsMap.put("Paris",false);

        if (flight != null) {
            if (((flightsMap.get(flight.departureAirport)) == true) && ((flightsMap.get(flight.arrivalAirport)) == true)) {

                System.out.println("Połączenie istnieje");
            } /*else {
                System.out.println("Połączenie NIE jest obsługiwane");
            }*/
        } else {
            throw new RouteNotFoundException("Nie ma takiego lotniska");
        }
        /*} else {
            System.out.println("Lotnisko nie znalezione");
        }*/

    }
}

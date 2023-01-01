package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String,Boolean> airportsMap = new HashMap<>();

        airportsMap.put("London Heathrow Airport", Boolean.TRUE);
        airportsMap.put("Paris Charles de Gaulle Airport", Boolean.TRUE);
        airportsMap.put("Frankfurt International Airport", Boolean.TRUE);
        airportsMap.put("Amsterdam Airport", Boolean.TRUE);
        airportsMap.put("Rome Fiumicino Airport", Boolean.TRUE);
        airportsMap.put("Madrid Barajas Airport", Boolean.TRUE);
        airportsMap.put("Munich International Airport", Boolean.TRUE);
        airportsMap.put("Barcelona Airport", Boolean.TRUE);
        airportsMap.put("Berlin Tegel Airport", Boolean.FALSE);
        airportsMap.put("Haren Airport", Boolean.FALSE);
        airportsMap.put("Doncaster Sheffield Airport", Boolean.FALSE);

        if (airportsMap.containsKey(flight.getArrivalAirport())
                && airportsMap.containsKey(flight.getDepartureAirport())
                && airportsMap.get(flight.getArrivalAirport())
                && airportsMap.get(flight.getDepartureAirport())
                && !flight.getArrivalAirport().equals(flight.getDepartureAirport())
        )
        {
            System.out.println("Flight found on the map.");
        } else  {
            throw new RouteNotFoundException();
        }

    }

}

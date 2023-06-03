package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.*;

public final class PossibleFlights {
    private final Map<Flight, LocalDateTime> flightList = new HashMap<>();

    public PossibleFlights(){

        flightList.put(new Flight("GDANSK", "POZNAN"), LocalDateTime.of(2023,2,12,15,30));
        flightList.put(new Flight("GDANSK", "WARSZAWA"), LocalDateTime.of(2023,2,14,14,25));
        flightList.put(new Flight("GDANSK", "LUBLIN"), LocalDateTime.of(2023,2,13,22,00));
        flightList.put(new Flight("POZNAN", "GDANSK"), LocalDateTime.of(2023,2,15,8,30));
        flightList.put(new Flight("POZNAN", "WARSZAWA"), LocalDateTime.of(2023,2,15,8,30));
        flightList.put(new Flight("POZNAN", "KATOWICE"), LocalDateTime.of(2023,2,22,10,35));
        flightList.put(new Flight("WARSZAWA", "GDANSK"), LocalDateTime.of(2023,2,7,5,15));
        flightList.put(new Flight("WARSZAWA", "POZNAN"), LocalDateTime.of(2023,2,8,15,30));
        flightList.put(new Flight("WARSZAWA", "KATOWICE"), LocalDateTime.of(2023,2,10,7,05));
        flightList.put(new Flight("WARSZAWA", "LUBLIN"), LocalDateTime.of(2023,2,10,9,10));
        flightList.put(new Flight("KATOWICE", "POZNAN"), LocalDateTime.of(2023,2,13,15,00));
        flightList.put(new Flight("KATOWICE", "WARSZAWA"), LocalDateTime.of(2023,2,19,14,30));
        flightList.put(new Flight("KATOWICE", "LUBLIN"), LocalDateTime.of(2023,2,18,12,54));
        flightList.put(new Flight("LUBLIN", "WARSZAWA"), LocalDateTime.of(2023,2,20,13,10));
        flightList.put(new Flight("LUBLIN", "KATOWICE"), LocalDateTime.of(2023,2,12,16,05));
    }

    public Map<Flight, LocalDateTime> getFlightList() {
        return flightList;
    }


}
package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        FindFlight findFlight = new FindFlight();

        findFlight.getPossibleFlightsFrom("GDANSK");
        findFlight.getPossibleFlightsTo("KATOWICE");
        findFlight.getPossibleFlightsBy("LUBLIN", "KATOWICE", "POZNAN");


    }
}

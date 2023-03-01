package com.kodilla.good.patterns.flights;


import java.util.List;
import java.util.stream.Collectors;

public class FindFlight {

    PossibleFlights possibleFlights = new PossibleFlights();
    List<String> possibleDepartures = possibleFlights.getFlightList().keySet().stream()
            .map(Flight::getArrivalAirport).collect(Collectors.toList());
    List<String> possibleArrivals = possibleFlights.getFlightList().keySet().stream()
            .map(Flight::getArrivalAirport).collect(Collectors.toList());


    public void getPossibleFlightsFrom(String departureAirport) {

        if (possibleDepartures.contains(departureAirport)) {
            System.out.println("Possible flight from " + departureAirport + ":");

            possibleFlights.getFlightList().entrySet().stream()
                    .filter(flight -> flight.getKey().getDepartureAirport().equals(departureAirport))
                    .map(entry -> entry.getKey() + ", date: " + entry.getValue()).toList().forEach(System.out::println);
        } else System.out.println("There is no flights from " + departureAirport);
    }

    public void getPossibleFlightsTo(String arrivalAirport) {

        if (possibleArrivals.contains(arrivalAirport)) {
            System.out.println("Possible flight to " + arrivalAirport + ":");

            possibleFlights.getFlightList().entrySet().stream()
                    .filter(flight -> flight.getKey().getArrivalAirport().equals(arrivalAirport))
                    .map(entry -> entry.getKey() + ", date: " + entry.getValue()).toList().forEach(System.out::println);
        } else System.out.println("There is no flights to " + arrivalAirport);
    }

    public void getPossibleFlightsBy(String departureAirport,String betweenAirport, String arrivalAirport){

        if (possibleDepartures.contains(departureAirport) && possibleDepartures.contains(betweenAirport) &&
                possibleArrivals.contains(betweenAirport) && possibleArrivals.contains(betweenAirport) &&
                possibleFlights.getFlightList().get(new Flight(departureAirport, betweenAirport)).isBefore(possibleFlights.getFlightList().get(new Flight(betweenAirport, arrivalAirport)))) {
            System.out.println("Possible flight from " + departureAirport + ", by " + betweenAirport + ", to " + arrivalAirport);

            System.out.println("First flight: ");
            possibleFlights.getFlightList().entrySet().stream()
                    .filter(flight -> flight.getKey().getDepartureAirport().equals(departureAirport))
                    .filter(flight -> flight.getKey().getArrivalAirport().equals(betweenAirport))
                    .map(entry -> entry.getKey() + ", date: " + entry.getValue()).toList().forEach(System.out::println);

            System.out.println("Second flight: ");
            possibleFlights.getFlightList().entrySet().stream()
                    .filter(flight -> flight.getKey().getDepartureAirport().equals(betweenAirport))
                    .filter(flight -> flight.getKey().getArrivalAirport().equals(arrivalAirport))
                    .map(entry -> entry.getKey() + ", date: " + entry.getValue()).toList().forEach(System.out::println);

        } else System.out.println("There is no flights from " + departureAirport + ", by " + betweenAirport + ", to " + arrivalAirport);



    }

}




package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        try{
            Flight flight = new Flight("Haren Airport", "London Heathrow Airport");
            FindFlight findFlight = new FindFlight();
            findFlight.findFlight(flight);

        }catch (RouteNotFoundException e){
            System.out.println("Flight not found. The given airport may not exist or be closed. " +
                    "Make sure you are entering the correct data.");
        }




    }
}

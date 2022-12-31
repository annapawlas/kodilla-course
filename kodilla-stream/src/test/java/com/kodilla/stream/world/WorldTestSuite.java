package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("37846611")));
        europe.addCountry(new Country("Belgium", new BigDecimal("11589623")));
        europe.addCountry(new Country("France", new BigDecimal("65273511")));
        europe.addCountry(new Country("Spain", new BigDecimal("46754778")));
        europe.addCountry(new Country("Germany", new BigDecimal("83783942")));

        Continent asia = new Continent("Asia");
        europe.addCountry(new Country("China", new BigDecimal("1439323776")));
        europe.addCountry(new Country("India", new BigDecimal("1380004385")));
        europe.addCountry(new Country("Indonesia", new BigDecimal("273523615")));

        Continent africa = new Continent("Africa");
        europe.addCountry(new Country("Nigeria", new BigDecimal("206139589")));
        europe.addCountry(new Country("Ethiopia", new BigDecimal("114963588")));
        europe.addCountry(new Country("Egypt", new BigDecimal("102334404")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal total = world.getPeopleQuantity();

        //Then
        BigDecimal expectedTotal = new BigDecimal("3761537822");
        Assertions.assertEquals(expectedTotal, total);




    }
}

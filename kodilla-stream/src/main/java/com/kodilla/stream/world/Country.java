package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    String countryName;
    BigDecimal quantity;

    public Country(String countryName, BigDecimal quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }
    public BigDecimal getPeopleQuantity(){
        return quantity;
    }
}

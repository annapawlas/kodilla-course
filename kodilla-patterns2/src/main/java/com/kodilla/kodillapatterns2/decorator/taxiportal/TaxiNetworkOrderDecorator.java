package com.kodilla.kodillapatterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator{
    protected TaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription() {
        return super.getDescription().concat(" by Taxi Network");
    }
}

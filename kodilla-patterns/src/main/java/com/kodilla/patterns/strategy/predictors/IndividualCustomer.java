package com.kodilla.patterns.strategy.predictors;

public final class IndividualCustomer extends Customer {

    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}

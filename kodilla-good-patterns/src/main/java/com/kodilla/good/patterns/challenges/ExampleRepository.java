package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Random;

public class ExampleRepository implements OrderRepository{

    @Override
    public boolean createOrder(User user, LocalDate localDate, Product product){
        return new Random().nextBoolean();
    }
}

package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class ExampleService implements OrderService {

    @Override
    public boolean order(final User user, final LocalDate orderDate, Product product) {
        return new Random().nextBoolean();
    }
}

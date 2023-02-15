package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;


public interface OrderService {

    boolean order(final User user, final LocalDate orderDate, Product product);
}

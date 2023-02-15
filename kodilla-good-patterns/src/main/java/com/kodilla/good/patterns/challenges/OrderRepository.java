package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {

    boolean createOrder(User user, LocalDate localDate, Product product);

}

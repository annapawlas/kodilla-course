package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Wekl", "", "");
        LocalDate orderDate = LocalDate.of(2022, 5, 3);
        Product product = new Product(0345, "jacket", 299);

        return new OrderRequest(user,orderDate, product);
    }
}

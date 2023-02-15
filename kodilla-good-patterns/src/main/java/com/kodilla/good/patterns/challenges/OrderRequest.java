package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private LocalDate orderDate;
    private Product product;


    public OrderRequest(final User user, final LocalDate orderDate, final Product product) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public Product getProduct() {
        return product;
    }
}

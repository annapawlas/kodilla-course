package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderDto {
    private User user;
    private LocalDate orderDate;
    private Product product;
    boolean isOrdered;

    public OrderDto(final User user, final LocalDate orderDate, final Product product, final boolean isOrdered) {
        this.user = user;
        this.orderDate = orderDate;
        this.product = product;
        this.isOrdered = isOrdered;
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

    public boolean isOrdered() {

        return isOrdered;
    }


}

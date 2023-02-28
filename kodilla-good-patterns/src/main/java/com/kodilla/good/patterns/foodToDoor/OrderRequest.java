package com.kodilla.good.patterns.foodToDoor;

import java.time.LocalDate;
import java.util.Map;

public class OrderRequest {

    private Client client;
    private FoodProducer foodProducer;
    private Map<Product, Integer> productOrderRequest;
    private LocalDate orderDate;

    public OrderRequest(Client client, FoodProducer foodProducer, Map<Product, Integer> productOrderRequest, LocalDate orderDate) {
        this.client = client;
        this.foodProducer = foodProducer;
        this.productOrderRequest = productOrderRequest;
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public FoodProducer getFoodProducer() {
        return foodProducer;
    }

    public Map<Product, Integer> getProductOrderRequest() {
        return productOrderRequest;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

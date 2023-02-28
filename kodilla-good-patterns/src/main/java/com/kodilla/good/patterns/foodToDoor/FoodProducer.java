package com.kodilla.good.patterns.foodToDoor;

import java.util.Map;

public interface FoodProducer {
    boolean process(Client client, Map<Product, Integer> productOrderRequest);

}

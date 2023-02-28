package com.kodilla.good.patterns.foodToDoor;

import java.util.Map;

public class GlutenFreeShop implements FoodProducer{

    @Override
    public boolean process(Client client, Map<Product, Integer> productOrderRequest){

        for (Map.Entry<Product, Integer> entry : productOrderRequest.entrySet()){

            if (entry.getKey().getAvailableAmount() < entry.getValue()) {
                System.out.println("We are sorry. Product " +entry.getKey().getName() + " is unavailable. The available amount is " +
                        entry.getKey().getAvailableAmount()+ ".");
                return false;
            }
        }
        System.out.println("Order completed.");
        return true;
    }
}

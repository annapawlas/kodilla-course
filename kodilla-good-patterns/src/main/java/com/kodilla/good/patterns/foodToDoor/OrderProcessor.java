package com.kodilla.good.patterns.foodToDoor;

import java.util.List;

public class OrderProcessor {

    public void orderProcess(List<OrderRequest> orderRequestList){

            orderRequestList.stream()
                    .map(n -> {
                        System.out.println("We are processing your order " + n.getClient().getName());
                        return n.getFoodProducer().process(n.getClient(), n.getProductOrderRequest());
                    }).forEach(System.out::println);

        }


}

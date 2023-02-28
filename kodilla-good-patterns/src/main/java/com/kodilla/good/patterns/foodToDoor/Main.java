package com.kodilla.good.patterns.foodToDoor;

public class Main {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        orderProcessor.orderProcess(orderRequestRetriever.retrieve());

    }
}

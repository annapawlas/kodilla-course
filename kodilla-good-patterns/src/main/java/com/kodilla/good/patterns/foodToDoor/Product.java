package com.kodilla.good.patterns.foodToDoor;

abstract class Product {

    private int id;
    private String name;
    private double price;
    private int availableAmount;

    public Product(int id, String name, double price, int availableAmount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.availableAmount = availableAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }
}

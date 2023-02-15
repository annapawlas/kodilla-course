package com.kodilla.good.patterns.challenges;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(final int id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getNameOfProduct() {
        return name;
    }

    public double getPriceOfProduct() {
        return price;
    }

    public int getId() {
        return id;
    }
}

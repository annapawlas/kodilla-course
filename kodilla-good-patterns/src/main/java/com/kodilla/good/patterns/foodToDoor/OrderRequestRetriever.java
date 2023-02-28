package com.kodilla.good.patterns.foodToDoor;


import java.time.LocalDate;
import java.util.*;

public class OrderRequestRetriever {

    public List<OrderRequest> retrieve() {

        Client client1 = new Client("John", "Stone", "jstone@gmail.com", "3969 Coolidge Street, Billings");
        FoodProducer healthyShop = new HealthyShop();
        LocalDate orderDate1 = LocalDate.of(2022,12,5);
        Map<Product, Integer> productsList1 = new HashMap<>();
        productsList1.put(new HealthyProduct(2454, "Acai Berry Powder", 30.99, 20), 2);
        productsList1.put(new HealthyProduct(2784, "Avocado", 5.99, 50), 6);
        productsList1.put(new HealthyProduct(2958, "Macadamia nuts", 9.99, 30), 3);

        Client client2 = new Client("Julie", "Smith", "jsmith@gmail.com", "3969 Coolidge Street, Billings");
        FoodProducer glutenFreeShop = new GlutenFreeShop();
        LocalDate orderDate2 = LocalDate.of(2023,1,12);
        Map<Product, Integer> productsList2 = new HashMap<>();
        productsList2.put(new HealthyProduct(3258, "Gluten-free oats", 0.99, 4), 5);

        List<OrderRequest> ordersList= new ArrayList<>();
        ordersList.add(new OrderRequest(client1, healthyShop, productsList1, orderDate1));
        ordersList.add(new OrderRequest(client2, glutenFreeShop, productsList2, orderDate2));

        return ordersList;
    }
}

package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getPizzaCost();
    String getPizzaIngredients();
}

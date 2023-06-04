package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder{
    @Override
    public BigDecimal getPizzaCost() {
        return new BigDecimal(15);
    }

    @Override
    public String getPizzaIngredients() {
        return "Ingredients: tomato sauce, cheese";
    }
}

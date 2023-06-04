package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaOrder{

    private PizzaOrder pizzaOrder;

    protected AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPizzaCost(){
        return pizzaOrder.getPizzaCost();
    };

    @Override
    public String getPizzaIngredients(){
        return pizzaOrder.getPizzaIngredients();
    };
}

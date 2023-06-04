package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class XxlSizePizzaDecorator extends AbstractPizzaDecorator{
    protected XxlSizePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(10));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients().concat(", size XXL");
    }
}

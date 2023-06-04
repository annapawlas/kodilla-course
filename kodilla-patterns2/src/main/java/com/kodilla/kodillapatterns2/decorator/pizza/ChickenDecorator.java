package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenDecorator extends AbstractPizzaDecorator{
    protected ChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(4));
    }

    @Override
    public String getPizzaIngredients() {
        return super.getPizzaIngredients().concat(", chicken");
    }
}

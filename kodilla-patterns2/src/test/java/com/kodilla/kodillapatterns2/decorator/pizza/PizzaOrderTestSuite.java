package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithExtraCheeseChickenXxlSize(){
        //Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new ChickenDecorator(thePizza);
        thePizza = new XxlSizePizzaDecorator(thePizza);

        //When
        BigDecimal thePizzaCost = thePizza.getPizzaCost();
        String thePizzaIngredients = thePizza.getPizzaIngredients();

        //Then
        Assertions.assertEquals(new BigDecimal(31), thePizzaCost);
        Assertions.assertEquals("Ingredients: tomato sauce, cheese, extra cheese, chicken, size XXL", thePizzaIngredients);
    }

    @Test
    public void testPizzaWithExtraCheeseAndDoubleBacon(){
        //Given
        PizzaOrder thePizza = new BasicPizza();
        thePizza = new ExtraCheeseDecorator(thePizza);
        thePizza = new BaconDecorator(thePizza);
        thePizza = new BaconDecorator(thePizza);

        //When
        BigDecimal thePizzaCost = thePizza.getPizzaCost();
        String thePizzaIngredients = thePizza.getPizzaIngredients();

        //Then
        Assertions.assertEquals(new BigDecimal(23), thePizzaCost);
        Assertions.assertEquals("Ingredients: tomato sauce, cheese, extra cheese, bacon, bacon", thePizzaIngredients);
    }
}

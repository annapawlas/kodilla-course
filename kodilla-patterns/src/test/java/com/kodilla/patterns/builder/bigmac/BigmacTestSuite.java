package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacBuider(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.MUSHROOMS)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngrediens = bigmac.getIngredients().size();

        //Then
        Assertions.assertEquals(2, howManyIngrediens);
    }
}

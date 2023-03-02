package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations(){
        calculator.add(1,3);
        calculator.sub(4,3);
        calculator.mul(3, 3);
        calculator.div(2,3);

    }
}

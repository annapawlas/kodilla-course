package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] exampleNumbers = {42, 4, 9, 18, 29, 39, 26, 34, 40, 11, 25, 32, 48, 10, 27, 7, 16, 22, 30, 43};

        //When
        double expectedAverage = 25.6;

        //Then
        Assertions.assertEquals(expectedAverage, ArrayOperations.getAverage(exampleNumbers).getAsDouble());


    }
}

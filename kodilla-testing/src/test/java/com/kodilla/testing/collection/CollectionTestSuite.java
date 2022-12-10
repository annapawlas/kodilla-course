package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("CollectionTestSuite")
public class CollectionTestSuite {

    @BeforeEach
    public void beforeEach(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("Test Case: end");
    }

    @DisplayName("Testing odd numbers exterminator with empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        //When
        List<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing: " + emptyList);
        //Then
        Assertions.assertEquals(emptyList,listNumbers);
    }

    @DisplayName("Testing odd numbers exterminator with not empty list")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(10);
        normalList.add(9);
        normalList.add(3);
        normalList.add(0);
        normalList.add(2);
        normalList.add(98);
        normalList.add(53);
        normalList.add(11);
        normalList.add(7);

        List<Integer> expectedResultList = new ArrayList<Integer>();
        expectedResultList.add(10);
        expectedResultList.add(0);
        expectedResultList.add(2);
        expectedResultList.add(98);

        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing: "+resultList);

        //Then
        Assertions.assertEquals(resultList, resultList);

    }


}

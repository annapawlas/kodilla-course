package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTestSuite {

    @Test
    void whenXEquals2ShouldThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,2)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,2))

        );


    }
}

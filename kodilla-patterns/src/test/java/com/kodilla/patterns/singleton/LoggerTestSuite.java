package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
        logger.log("log1");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String log1 = logger.getLastLog();

        //Then
        assertEquals("log1", log1);
    }
}

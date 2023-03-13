package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testMakeShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeATask(TaskFactory.SHOPPING);

        //Then
        Assertions.assertEquals("Shopping Task", shopping.getTaskName());
    }

    @Test
    void testMakeDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeATask(TaskFactory.DRIVING);

        //Then
        Assertions.assertEquals("Driving Task", driving.getTaskName());
    }

    @Test
    void testMakePaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeATask(TaskFactory.PAINTING);

        //Then
        Assertions.assertEquals("Painting Task", painting.getTaskName());
    }
}

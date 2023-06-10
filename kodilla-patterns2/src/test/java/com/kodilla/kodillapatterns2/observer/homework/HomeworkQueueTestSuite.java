package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeworkQueueTestSuite {

    @Test
    void testUpdate(){
        //Given
        Coach scarlettGardner = new Coach("Scarlett Gardner");
        Coach joelWilkins = new Coach("Joel Wilkins");
        HomeworkQueue studentOneHomeworkQueue = new StudentOneHomeworkQueue();
        HomeworkQueue studentTwoHomeworkQueue = new StudentTwoHomeworkQueue();
        HomeworkQueue studentThreeHomeworkQueue = new StudentThreeHomeworkQueue();
        studentOneHomeworkQueue.assignCoachToHomeworkQueue(scarlettGardner);
        studentTwoHomeworkQueue.assignCoachToHomeworkQueue(joelWilkins);
        studentThreeHomeworkQueue.assignCoachToHomeworkQueue(joelWilkins);
        //When
        studentOneHomeworkQueue.addTaskToAQueue("Finished task number 1");
        studentOneHomeworkQueue.addTaskToAQueue("Finished task number 2");
        studentOneHomeworkQueue.addTaskToAQueue("Finished task number 3");
        studentTwoHomeworkQueue.addTaskToAQueue("Finished task number 1");
        studentTwoHomeworkQueue.addTaskToAQueue("Finished task number 2");
        studentThreeHomeworkQueue.addTaskToAQueue("Finished task number 1");
        studentThreeHomeworkQueue.addTaskToAQueue("Finished task number 2");
        //Then
        Assertions.assertEquals(3,scarlettGardner.getUpdateCount());
        Assertions.assertEquals(4, joelWilkins.getUpdateCount());
    }

}

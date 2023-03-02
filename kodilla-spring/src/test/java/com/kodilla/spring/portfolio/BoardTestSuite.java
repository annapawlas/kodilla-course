package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Task #1 to do";
        String taskInProgress = "Task #1 in progress";
        String taskDone = "Task #1 done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assertions.assertEquals("Task #1 to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Task #1 in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Task #1 done", board.getDoneList().getTasks().get(0));
    }
}
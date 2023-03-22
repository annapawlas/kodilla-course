package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("First TaskList", "This is the first task list");
        taskListDao.save(taskList);
        //When
        List<TaskList> readTaskList = taskListDao.findByListName("First TaskList");
        //Then
        Assertions.assertEquals(1, readTaskList.size());
        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}

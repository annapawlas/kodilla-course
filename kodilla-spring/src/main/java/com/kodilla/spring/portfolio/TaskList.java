package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public boolean addTask(String theTask){
        return tasks.add(theTask);
    }

}


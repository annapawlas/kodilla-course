package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String queueName;

    public HomeworkQueue(String queueName) {
        this.queueName = queueName;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void addTaskToAQueue(String task){
        tasks.add(task);
        notifyCoach();
    }

    @Override
    public void assignCoachToHomeworkQueue(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeCoachFromHomeworkQueue(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyCoach() {
        for (Observer observer:observers) {
            observer.updateQueue(this);
        }
    }

    public String getQueueName() {
        return queueName;
    }
}

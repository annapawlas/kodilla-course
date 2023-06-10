package com.kodilla.kodillapatterns2.observer.homework;

public class Coach implements Observer{

    private String coachName;
    public int updateCount;

    public Coach(String coachName) {
        this.coachName = coachName;
    }

    @Override
    public void updateQueue(HomeworkQueue homeworkQueue) {
        System.out.println(coachName + ": there is a new task in " + homeworkQueue.getQueueName());
        updateCount++;
    }

    public String getCoachName() {
        return coachName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

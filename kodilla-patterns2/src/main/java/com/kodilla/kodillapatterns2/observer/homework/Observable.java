package com.kodilla.kodillapatterns2.observer.homework;

public interface Observable {
    void assignCoachToHomeworkQueue(Observer observer);
    void removeCoachFromHomeworkQueue(Observer observer);
    void notifyCoach();
}

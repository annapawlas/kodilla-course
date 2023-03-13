package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String SHOPPING = "SHOPPING";
    public final static String DRIVING = "DRIVING";
    public final static String PAINTING = "PAINTING";

    public Task makeATask(final String taskClass){

        return switch (taskClass){
            case SHOPPING -> new ShoppingTask("Shopping Task", "Banana", 4);
            case DRIVING -> new DrivingTask("Driving Task", "Home", "John");
            case PAINTING -> new PaintingTask("Painting Task", "blue", "sky");
            default -> null;
        };
    }
}

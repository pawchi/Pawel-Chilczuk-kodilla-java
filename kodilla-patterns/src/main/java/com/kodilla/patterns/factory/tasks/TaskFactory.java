package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTINGTASK = "PAINTING";
    public static final String DRIVINGTASK = "DRIVING";
    public static final String SHOPPINGTASK = "SHOPPING";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case PAINTINGTASK:
                return new PaintingTask("Painting","blue","SKY");
            case DRIVINGTASK:
                return new DrivingTask("Driving","London","BMW");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping","Apple",3.0);
            default:
                return null;
        }
    }

}

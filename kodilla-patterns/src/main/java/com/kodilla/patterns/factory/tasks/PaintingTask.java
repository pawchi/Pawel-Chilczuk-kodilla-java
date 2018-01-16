package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    protected boolean taskExecutionStatus;

    @Override
    public boolean executeTask(){
        System.out.println("Painting is doing something");
        taskExecutionStatus = true;
        return taskExecutionStatus;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        if(taskExecutionStatus=true) {
            return true;
        }else {
            return false;
        }
    }
}
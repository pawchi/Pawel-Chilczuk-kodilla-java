package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    protected boolean taskExecutionStatus;

    @Override
    public boolean executeTask(){
        System.out.println("Driving is doing something");
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

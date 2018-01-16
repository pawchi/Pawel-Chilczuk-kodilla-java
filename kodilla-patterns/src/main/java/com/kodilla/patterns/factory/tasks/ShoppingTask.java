package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;


    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName=taskName;
        this.whatToBuy=whatToBuy;
        this.quantity=quantity;
    }

    protected boolean taskExecutionStatus;

    @Override
    public boolean executeTask(){
        System.out.println("Shopping is doing something");
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

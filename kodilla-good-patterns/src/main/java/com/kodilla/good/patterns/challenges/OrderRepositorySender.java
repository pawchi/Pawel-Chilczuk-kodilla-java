package com.kodilla.good.patterns.challenges;

public class OrderRepositorySender implements OrderRepository {
    @Override
    public void sendOrder(User user,Product product){
        System.out.println("Order product :"+product.getItemName() +"; for user: "+user.getNick()+" has been successfully created. ");
    }
}

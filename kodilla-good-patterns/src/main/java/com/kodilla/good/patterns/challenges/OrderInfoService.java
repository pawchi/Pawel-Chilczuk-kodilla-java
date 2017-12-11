package com.kodilla.good.patterns.challenges;

public class OrderInfoService implements InformationService {
    @Override
    public void sendInfoToUser(User user) {
        System.out.println("Information to user: "+user.getNick()+" about product order has been sent.");
    }
}

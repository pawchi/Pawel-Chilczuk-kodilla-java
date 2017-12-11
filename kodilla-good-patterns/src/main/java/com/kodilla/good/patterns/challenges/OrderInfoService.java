package com.kodilla.good.patterns.challenges;

public class OrderInfoService implements InformationService {
    @Override
    public void sendInfoToUser(User user) {
        System.out.println("Information to user about product sending");
    }
}

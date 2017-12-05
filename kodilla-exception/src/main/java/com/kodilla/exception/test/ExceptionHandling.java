package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(10,2);
        } catch (Exception e){
            System.out.println("Exception from SecondChallenge");
        }
    }
}

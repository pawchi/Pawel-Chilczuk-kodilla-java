package com.kodilla.testing.calculator;

public class Application {
    public static void main(String[] args) {

        double testA=50;
        double testB=15;
        double testAdd=testA+testB;
        double testSubstract=testA-testB;

        Calculator run = new Calculator(testA,testB);
        double resultAdd = run.add();
        double resultSubstract = run.substract();


        if(testAdd==resultAdd) {
            System.out.println("Test method Add OK");
        }else{
            System.out.println("Test method Add ERROR");
        }

        if(resultSubstract==testSubstract) {
            System.out.println("Test method Substract OK");
        }else{
            System.out.println("Test method Substract ERROR");
        }
    }
    }

package com.example.algorithm.designmode.abstractfactory;


public abstract class AbstractYellowHuman implements Human {

    @Override
    public void laugh() {
        // TODO Auto-generated method stub
        System.out.println("黄种人在笑");
    }

    @Override
    public void cry() {
        // TODO Auto-generated method stub
        System.out.println("黄种人在哭");


    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        System.out.println("黄种人在说");
    }

}

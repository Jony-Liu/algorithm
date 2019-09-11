package com.example.algorithm.designmode.abstractfactory;

/**
 * @author Jony-Liu
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void laugh() {
        // TODO Auto-generated method stub
        System.out.println("白种人在笑");

    }

    @Override
    public void cry() {
        // TODO Auto-generated method stub
        System.out.println("白种人在哭");
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        System.out.println("白种人在说");
    }

}

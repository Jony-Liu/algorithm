package com.example.algorithm.designmode.abstractfactory;

public abstract class AbstractHumanFactory implements HumanFactory {
    public Human createHuman(Class c) throws ClassNotFoundException{
        Human human =null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return human;
    }

}
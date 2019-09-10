package com.example.algorithm.designmode.abstractfactory;

/**
 * @author Jony-Liu
 */
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
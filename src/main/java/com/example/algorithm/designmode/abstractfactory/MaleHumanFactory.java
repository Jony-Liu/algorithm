package com.example.algorithm.designmode.abstractfactory;


public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createYellowHuman() {
        // TODO Auto-generated method stub
        Human human = null;
        try {
            human = super.createHuman(YellowMaleHuman.class);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return human;
    }

    @Override
    public Human createWhiteHuman() {
        // TODO Auto-generated method stub
        Human human = null;
        try {
            human = super.createHuman(WhiteMaleHuman.class);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return human;
    }

    @Override
    public Human createBlackHuman() {
        // TODO Auto-generated method stub
        Human human = null;
        try {

            human = super.createHuman(BlackMaleHuman.class);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return human;
    }

}

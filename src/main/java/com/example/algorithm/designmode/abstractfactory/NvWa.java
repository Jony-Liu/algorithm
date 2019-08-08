package com.example.algorithm.designmode.abstractfactory;

public class NvWa {
    public static void main(String[] args) {
        MaleHumanFactory m = new MaleHumanFactory();
        YellowMaleHuman human = (YellowMaleHuman)m.createYellowHuman();
        human.sex();
        human.cry();
        human.talk();
    }
}

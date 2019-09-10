package com.example.algorithm.designmode.abstractfactory;

/**
 * @author Jony-Liu
 */
public class NvWa {
    public static void main(String[] args) {
        MaleHumanFactory m = new MaleHumanFactory();
        YellowMaleHuman human = (YellowMaleHuman)m.createYellowHuman();
        human.sex();
        human.laugh();
        human.cry();
        human.talk();
    }
}

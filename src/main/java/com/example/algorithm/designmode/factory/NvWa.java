package com.example.algorithm.designmode.factory;

/**
 * @author Jony-Liu
 */
public class NvWa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HumanFactory h = new HumanFactory();
        Human humanA=h.createHuman(YellowHuman.class);
        humanA.laugh();
        humanA.cry();
        humanA.talk();
        Human humanB=h.createHuman(WhiteHuman.class);
        humanB.laugh();
        humanB.cry();
        humanB.talk();
        Human humanC=h.createHuman(BlackHuman.class);
        humanC.laugh();
        humanC.cry();
        humanC.talk();
    }

}

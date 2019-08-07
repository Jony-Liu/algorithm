package com.example.algorithm.designmode.factory;

public class NvWa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HumanFactory h = new HumanFactory();
        Human humanA=h.creatHuman(YellowHuman.class);
        humanA.laugh();
        Human humanB=h.creatHuman(WhiteHuman.class);
        humanB.laugh();
    }

}

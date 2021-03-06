package com.example.algorithm.designmode.observer;

/**
 * @author Jony-Liu
 * @date 2019/9/21 20:07
 */
public class HuangPuCitizen extends Citizen {

    public HuangPuCitizen(Policeman pol) {
        setPolicemen();
        register(pol);
    }

    @Override
    public void sendMessage(String help) {
        setHelp(help);
        for (int i = 0; i < pols.size(); i++) {
            Policeman pol = (Policeman)pols.get(i);
            //通知警察行动
            pol.action(this);
        }
    }
}


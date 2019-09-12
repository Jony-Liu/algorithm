package com.example.algorithm.designmode.template;

/**
 * @author Jony-Liu
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HanmaH1 h1 = new HanmaH1();
        h1.run();
        HanmaH2 h2 = new HanmaH2();
        h2.setAlarm(true);
        h2.run();
    }

}
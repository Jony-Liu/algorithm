package com.example.algorithm.lock;


public class DramThread extends Thread {

    Account account;
    int money;

    public DramThread( Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        for(int i =0;i<100;i++){
            account.draw(money);
        }
        // TODO Auto-generated method stub
    }

}

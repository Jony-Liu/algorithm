package com.example.algorithm.lock;


public class DepositThread extends Thread {

    Account account;
    int money;

    public DepositThread(Account account, int money) {

        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 100; i++)
            account.deposit(money);
    }
}

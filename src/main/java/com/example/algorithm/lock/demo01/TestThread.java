package com.example.algorithm.lock.demo01;

public class TestThread {

    static Account account = new Account("123", 0);

    public static void main(String[] args) {
        new DramThread(account, 100).start();
        new DepositThread(account, 100).start();
    }

}
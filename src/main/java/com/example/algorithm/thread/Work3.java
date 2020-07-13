package com.example.algorithm.thread;

/*
 * 假设某家银行可接受顾客的汇款，每进行一步汇款，便可计算出汇款总额。
现有两名顾客，每人都分 3 次.每次 100 元将钱汇入。试编写一个程序，来模拟
顾客的汇款操作。

 */
class Account implements Runnable {//Account 银行账户
    private double money = 0;//账户余额

    public synchronized void SendMoney() {//同步方法
        money += 100;
        System.out.println(Thread.currentThread().getName() + "汇款100元，现账户余额：" + money);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 3; i++) {
            SendMoney();
        }
    }

}

/**
 * @author Jony-Liu
 */
public class Work3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Account account = new Account();
        Thread user1 = new Thread(account, "用户1");
        Thread user2 = new Thread(account, "用户2");
        user1.start();
        user2.start();

    }

}

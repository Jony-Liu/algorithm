package com.example.algorithm.thread;

/**
 * @author Jony-Liu
 * @date 2019/12/20 9:32
 */
public class Work3_02 {

    public static void main(String[] args) {
        Account02 account = new Account02();
        Thread thread01 = new Thread(account,"客户1");
        Thread thread02 = new Thread(account,"客户2");
        thread01.start();
        thread02.start();
    }
}

/**
 * Account 银行账户
 */
class Account02 implements Runnable {
    //账户余额
    private double money = 0;

    @Override
    synchronized public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 30; i++) {
            money += 100;
            System.out.println(Thread.currentThread().getName() + "汇款100元，现账户余额：" + money);
        }
    }

}

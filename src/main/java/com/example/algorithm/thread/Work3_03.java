package com.example.algorithm.thread;

/**
 * @author jonyliu
 * @date 2019/12/20 9:46
 */
public class Work3_03 {
    public static void main(String[] args) {
        MyThread_03 myThread_03 = new MyThread_03();
        Thread thread01 = new Thread(myThread_03);
        Thread thread02 = new Thread(myThread_03);
        Thread thread03 = new Thread(myThread_03);
        Thread thread04 = new Thread(myThread_03);
        Thread thread05 = new Thread(myThread_03);
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
    }
}

class MyThread_03 extends Thread{
    private int count = 5;
    @Override
    synchronized public void run(){
        super.run();
        count--;
        System.out.println(this.currentThread().getName()+"计算 count:"+count);
    }
}

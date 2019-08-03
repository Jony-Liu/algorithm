package com.example.algorithm.thread;

public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread m1 = new MyThread("thread");
        m1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(m1.isAlive());

        m1.start();
        System.out.println(m1.isAlive());
        m1.join();
        //m1.yield();
        for(int i= 0;i<100;i++){
            System.out.println("-------"+m1.isAlive()+Thread.currentThread().getName()+":  "+i);
        }

    }
}

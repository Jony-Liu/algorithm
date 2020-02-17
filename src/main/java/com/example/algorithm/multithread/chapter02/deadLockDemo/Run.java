package com.example.algorithm.multithread.chapter02.deadLockDemo;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 11:17
 */
public class Run {
    public static void main(String[] args) {
        DealThread t1 = new DealThread();
        t1.setFlag("a");
        Thread thread1 = new Thread(t1);
        thread1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.setFlag("b");
        Thread thread2 = new Thread(t1);
        thread2.start();
    }
}

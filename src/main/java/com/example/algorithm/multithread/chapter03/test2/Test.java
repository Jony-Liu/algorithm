package com.example.algorithm.multithread.chapter03.test2;

/**
 * @author Jony-Liu
 * @date 2020/3/24 22:41
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread1 myThread1 = new MyThread1(lock);
        myThread1.start();
        Thread.sleep(2000);
        MyThread2 myThread2 = new MyThread2(lock);
        myThread2.start();
    }
}

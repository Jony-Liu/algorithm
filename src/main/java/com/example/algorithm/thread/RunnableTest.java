package com.example.algorithm.thread;

public class RunnableTest {
    public static void main(String[] args) {
        /*MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();*/
        //MyThread1 m1 = new MyThread1();
        //Thread t1 = new Thread(m1);
        //t1.start();
        MyThread2 m2 = new MyThread2();
        Thread t2 = new Thread(m2, "thread1");
        Thread t3 = new Thread(m2, "thread2");
        t3.start();
        t2.start();
    }
}
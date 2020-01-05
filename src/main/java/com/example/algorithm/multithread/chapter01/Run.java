package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/22 18:54
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

package com.example.algorithm.multithread.chapter06.singleton_1;

/**
 * @author Jony-Liu
 * @date 2020/4/5 18:53
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}

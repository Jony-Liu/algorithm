package com.example.algorithm.multithread.chapter06.singleton_5;

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
/*        MyThread[] myThreads = new MyThread[20];
        for (int i = 0; i < 20; i++) {
            myThreads[i]  = new MyThread();
        }
        for (int i = 0; i < 20; i++) {
            myThreads[i].start();
        }*/
    }
}

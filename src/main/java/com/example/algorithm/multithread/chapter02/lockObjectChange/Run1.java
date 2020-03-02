package com.example.algorithm.multithread.chapter02.lockObjectChange;

/**
 * @author Jony-Liu
 * @date: 2020/3/2 21:53
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}

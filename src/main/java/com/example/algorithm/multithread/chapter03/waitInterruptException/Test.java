package com.example.algorithm.multithread.chapter03.waitInterruptException;

/**
 * @author Jony-Liu
 * @date 2020/3/26 21:34
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

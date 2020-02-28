package com.example.algorithm.multithread.chapter02.t8;

/**
 * @author Jony-Liu
 * @date 2020/1/20 15:41
 */
public class Task {
    synchronized public void otherMethod() {
        System.out.println("-------------------run--otherMethod");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + "i = " + (i + 1));
            }
        }
    }
}

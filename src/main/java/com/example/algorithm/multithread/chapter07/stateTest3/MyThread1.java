package com.example.algorithm.multithread.chapter07.stateTest3;

/**
 * @author Jony-Liu
 * @date 2020/4/6 1:08
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}

package com.example.algorithm.multithread.chapter04.ReentrantLockTest;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:00
 */
public class MyThread extends Thread {
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}

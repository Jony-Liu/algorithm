package com.example.algorithm.multithread.chapter02.lockObjectChange;

/**
 * @author Jony-Liu
 * @date: 2020/3/2 21:55
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}

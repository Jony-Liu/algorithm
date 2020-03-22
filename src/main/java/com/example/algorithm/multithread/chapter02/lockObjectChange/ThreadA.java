package com.example.algorithm.multithread.chapter02.lockObjectChange;

/**
 * @author Jony-Liu
 * @date 2020/3/2 21:54
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}

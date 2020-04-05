package com.example.algorithm.multithread.chapter04.UseConditionWaitNotifyOk;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:42
 */
public class ThreadA extends Thread {
    private MyService myService;
    public ThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}

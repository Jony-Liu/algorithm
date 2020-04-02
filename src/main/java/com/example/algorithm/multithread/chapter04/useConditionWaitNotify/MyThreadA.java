package com.example.algorithm.multithread.chapter04.useConditionWaitNotify;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:16
 */
public class MyThreadA extends Thread {

    private MyService myService;

    public MyThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}

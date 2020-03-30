package com.example.algorithm.multithread.chapter04.ConditionTest;

/**
 * @author Jony-Liu
 * @date 2020/3/29 23:59
 */
public class MyThreadB extends Thread {
    private MyService myService;
    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}

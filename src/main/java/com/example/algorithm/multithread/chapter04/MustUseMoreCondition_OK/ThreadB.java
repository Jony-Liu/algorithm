package com.example.algorithm.multithread.chapter04.MustUseMoreCondition_OK;

/**
 * @author Jony-Liu
 * @date 2020/3/29 23:14
 */
public class ThreadB extends Thread {

    private  MyService myService ;

    public ThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}

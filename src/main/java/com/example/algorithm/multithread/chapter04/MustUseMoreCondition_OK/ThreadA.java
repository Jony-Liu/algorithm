package com.example.algorithm.multithread.chapter04.MustUseMoreCondition_OK;

/**
 * @author Jony-Liu
 * @date 2020/3/29 23:13
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}

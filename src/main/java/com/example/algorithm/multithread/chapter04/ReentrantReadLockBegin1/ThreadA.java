package com.example.algorithm.multithread.chapter04.ReentrantReadLockBegin1;

/**
 * @author Jony-Liu
 * @date 2020/4/4 11:10
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
        //service.write();
    }
}

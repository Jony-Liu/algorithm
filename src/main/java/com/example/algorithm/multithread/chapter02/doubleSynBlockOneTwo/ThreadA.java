package com.example.algorithm.multithread.chapter02.doubleSynBlockOneTwo;

/**
 * @author Jony-Liu
 * @date 2020/1/20 15:23
 */
public class ThreadA extends Thread{
    private ObjectService objectService;

    public ThreadA(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodA();
    }
}

package com.example.algorithm.multithread.chapter02.doubleSynBlockOneTwo;

/**
 * @author jonyliu
 * @date 2020/1/20 15:28
 */
public class ThreadB extends Thread {
    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }
}

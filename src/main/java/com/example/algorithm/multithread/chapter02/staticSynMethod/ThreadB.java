package com.example.algorithm.multithread.chapter02.staticSynMethod;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 10:09
 */
public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}

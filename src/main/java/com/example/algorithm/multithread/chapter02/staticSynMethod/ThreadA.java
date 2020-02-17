package com.example.algorithm.multithread.chapter02.staticSynMethod;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 10:06
 */
public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}

package com.example.algorithm.multithread.chapter02.synchronizedUpdateNewValue;

/**
 * @author Jony-Liu
 * @date 2020/3/19 23:04
 */
public class ThreadA extends Thread{
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}

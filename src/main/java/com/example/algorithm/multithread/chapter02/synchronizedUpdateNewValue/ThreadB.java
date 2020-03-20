package com.example.algorithm.multithread.chapter02.synchronizedUpdateNewValue;

/**
 * @author Jony-Liu
 * @date 2020/3/19 23:06
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}

package com.example.algorithm.multithread.chapter02.synBlockString2;


/**
 * @author Jony-Liu
 * @date 2020/1/20 17:33
 */
public class ThreadA extends  Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}

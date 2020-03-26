package com.example.algorithm.multithread.chapter03.waitInterruptException;

/**
 * @author Jony-Liu
 * @date 2020/3/26 21:31
 */
public class ThreadA extends Thread{
    private Object lock;
    public ThreadA(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}

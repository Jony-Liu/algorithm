package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:24
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}

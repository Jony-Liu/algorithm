package com.example.algorithm.multithread.chapter02;

public class MyThread extends  Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}

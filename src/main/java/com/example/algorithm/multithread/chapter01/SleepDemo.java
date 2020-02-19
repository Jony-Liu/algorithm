package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/25 8:48
 */
public class SleepDemo extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("begin = "+System.currentTimeMillis());
            sleep(2000);
            System.out.println("end = "+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

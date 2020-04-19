package com.example.algorithm.multithread.chapter07.groupAddThread;

/**
 * @author Jony-Liu
 * @date 2020/4/6 11:31
 */
public class MyThreadA extends Thread {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread name " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

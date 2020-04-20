package com.example.algorithm.multithread.chapter07.stateTest4;

/**
 * 验证WAITING
 * @author Jony-Liu
 * @date 2020/4/6 1:26
 */
public class MyThread extends Thread {
    public static final Byte LOCK = new Byte("0");

    @Override
    public void run() {
        try {
            synchronized (LOCK) {
                LOCK.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

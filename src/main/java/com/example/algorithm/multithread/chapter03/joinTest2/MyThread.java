package com.example.algorithm.multithread.chapter03.joinTest2;

/**
 * @author Jony-Liu
 * @date 2020/3/29 0:23
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        int secondValue = (int) (Math.random() * 10000);
        System.out.println(secondValue);
        try {
            Thread.sleep(secondValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package com.example.algorithm.multithread.chapter07.stateTest2;

/**
 * 验证TIMED_WAITING
 * @author Jony-Liu
 * @date 2020/4/6 0:42
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

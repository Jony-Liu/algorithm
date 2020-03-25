package com.example.algorithm.multithread.chapter03.test2;

/**
 * @author Jony-Liu
 * @date 2020/3/24 22:36
 */
public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                System.out.println("开始 wait time " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

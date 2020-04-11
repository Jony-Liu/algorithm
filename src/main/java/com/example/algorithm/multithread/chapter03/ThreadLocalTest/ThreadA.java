package com.example.algorithm.multithread.chapter03.ThreadLocalTest;

/**
 * @author Jony-Liu
 * @date 2020/3/29 19:40
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Tools.t1.set("ThreadA"+(i+1));
            System.out.println("ThreadA get Value = "+ Tools.t1.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

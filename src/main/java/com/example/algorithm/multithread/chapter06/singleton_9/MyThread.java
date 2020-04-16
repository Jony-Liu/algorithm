package com.example.algorithm.multithread.chapter06.singleton_9;

/**
 * @author Jony-Liu
 * @date 2020/4/5 23:22
 */
public class MyThread  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.getInstance().hashCode());
        }
    }
}

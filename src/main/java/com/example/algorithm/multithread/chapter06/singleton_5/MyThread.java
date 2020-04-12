package com.example.algorithm.multithread.chapter06.singleton_5;

/**
 * @author Jony-Liu
 * @date 2020/4/5 18:51
 */
public class MyThread extends Thread {
     @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}

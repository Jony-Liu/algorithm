package com.example.algorithm.multithread.chapter03.joinTest2;

import com.example.algorithm.multithread.chapter03.joinTest1.MyThread;

/**
 * @author Jony-Liu
 * @date 2020/3/29 0:24
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我想当myThread执行完成后在执行，我做到了");
    }
}

package com.example.algorithm.multithread.chapter01;

/**
 * @author jonyliu
 * @date 2019/12/25 8:51
 */
public class SleepTest {
    public static void main(String[] args) {
        SleepDemo sleepDemo = new SleepDemo();
        System.out.println("main begin = "+System.currentTimeMillis());
        sleepDemo.start();
        System.out.println("main end = "+System.currentTimeMillis());
    }
}

package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2020/1/5 14:49
 */
public class CountPriorityTest {
    public static void main(String[] args) throws Exception {
        CountPriorityDemo thread01 = new CountPriorityDemo();
        thread01.setPriority(Thread.NORM_PRIORITY - 3);
        thread01.start();
        CountPriorityDemo thread02 = new CountPriorityDemo();
        thread02.setPriority(Thread.NORM_PRIORITY + 3);
        thread02.start();
        Thread.sleep(20000);
        thread01.stop();
        thread02.stop();
        System.out.println("thread01 :" + thread01.getCount());
        System.out.println("thread02 :" + thread02.getCount());
    }
}

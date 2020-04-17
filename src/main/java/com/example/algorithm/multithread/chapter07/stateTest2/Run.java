package com.example.algorithm.multithread.chapter07.stateTest2;

/**
 * @author Jony-Liu
 * @date 2020/4/6 0:44
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态："+myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

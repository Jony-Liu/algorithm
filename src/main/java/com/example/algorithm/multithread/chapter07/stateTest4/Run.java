package com.example.algorithm.multithread.chapter07.stateTest4;

/**
 * @author Jony-Liu
 * @date 2020/4/6 1:30
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态："+t.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

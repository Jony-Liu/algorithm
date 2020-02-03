package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/30 9:38
 */
public class SuspendResumeTest02 {
    public static void main(String[] args) throws Exception {
        SuspendResumeDemo02 suspendResumeDemo02 = new SuspendResumeDemo02();
        Thread thread01 = new Thread() {
            @Override
            public void run() {
                suspendResumeDemo02.printString();
            }
        };
        thread01.setName("a");
        thread01.start();
        Thread.sleep(1000);
        Thread thread02 = new Thread() {
            @Override
            public void run() {
                System.out.println("无法进入printString()");
                suspendResumeDemo02.printString();
            }
        };
        thread02.start();
    }
}

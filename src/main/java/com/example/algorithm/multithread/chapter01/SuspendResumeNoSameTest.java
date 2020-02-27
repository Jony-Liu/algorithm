package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/30 21:25
 */
public class SuspendResumeNoSameTest {
    public static void main(String[] args) throws Exception {
        SuspendResumeNoSameDemo myobject = new SuspendResumeNoSameDemo();
        Thread thread = new Thread(){
            @Override
            public void run() {
                myobject.setValue("a","aa");
            }
        };
        thread.setName("a");
        thread.start();
        Thread.sleep(500);
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                myobject.printUserAndPassWord();
            }
        };

        thread1.start();
    }
}

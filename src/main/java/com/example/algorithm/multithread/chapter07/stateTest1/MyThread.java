package com.example.algorithm.multithread.chapter07.stateTest1;

/**
 * 验证NEW、RUNNABLE和TERMINATED
 * @author Jony-Liu
 * @date 2020/4/6 0:34
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法中的状态："+Thread.currentThread().getState()+
                " Thread name "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态"+Thread.currentThread().getState()+
                " Thread name "+Thread.currentThread().getName());
    }
}

package com.example.algorithm.multithread.chapter07.groupAddThread;

/**
 * 线程组
 * @author Jony-Liu
 * @date 2020/4/6 11:34
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main Thread name:"+Thread.currentThread().getName());
        MyThreadA aRunnable = new MyThreadA();
        MyThreadB bRunnable = new MyThreadB();
        ThreadGroup group = new ThreadGroup("My thread group");
        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();
        System.out.println("活动的线程："+group.activeCount());
        System.out.println("线程组的名称："+group.getName());
    }
}

package com.example.algorithm.multithread.chapter04.UseConditionWaitNotifyOk;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:47
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myService.signal();
    }
}

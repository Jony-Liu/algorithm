package com.example.algorithm.multithread.chapter02.t8;

/**
 * @author Jony-Liu
 * @date 2020/1/20 15:56
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(100);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}

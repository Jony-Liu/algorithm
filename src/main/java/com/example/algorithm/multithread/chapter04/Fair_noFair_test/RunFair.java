package com.example.algorithm.multithread.chapter04.Fair_noFair_test;

/**
 * @author Jony-Liu
 * @date 2020/4/2 22:57
 */
public class RunFair {

    public static void main(String[] args) {
        //公平锁 FIFO
        final Service service = new Service(true);
        //非公平锁 全部随机
        //final Service service = new Service(false);
        Runnable runnable = () -> {
            System.out.println("线程" + Thread.currentThread().getName() + "运行了");
            service.serviceMethod();
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }

}
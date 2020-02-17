package com.example.algorithm.multithread.chapter02.staticSynMethod;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 10:03
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + " 进入 pringA()");
            Thread.sleep(3000);
            System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + " 离开 pringA()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 效果同上相同
     */
    public static void printA1() {
        synchronized (Service.class) {
            //...
        }
    }

    synchronized public static void printB() {
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + " 进入 printB()");
        System.out.println("线程名称：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + " 离开 printB()");
    }

    /**
     * 效果同上相同
     */
    public static void printB1() {
        synchronized (Service.class) {
            //...
        }
    }
}

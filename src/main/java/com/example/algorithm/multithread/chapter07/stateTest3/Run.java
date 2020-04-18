package com.example.algorithm.multithread.chapter07.stateTest3;

/**
 * @author Jony-Liu
 * @date 2020/4/6 1:09
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        try {
            //未添加看不到效果
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main方法中的t2状态："+t2.getState());

    }
}

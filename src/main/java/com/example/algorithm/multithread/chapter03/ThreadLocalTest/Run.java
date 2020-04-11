package com.example.algorithm.multithread.chapter03.ThreadLocalTest;

/**
 * @author Jony-Liu
 * @date 2020/3/29 19:44
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 100; i++) {
            Tools.t1.set("Main"+(i+1));
            System.out.println("Main get Value = "+Tools.t1.get());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

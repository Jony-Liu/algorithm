package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:18
 */
public class MyObject {
    private int num;

    synchronized public void methodA(int i) {
        try {
            this.num = i;
            Thread.sleep(2000);
            System.out.println("methodA  i = " + i);
            System.out.println("methodA  num = " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void methodB(int i) {
        try {
            this.num = i;
            System.out.println("methodB  i = " + i);
            System.out.println("methodB  num = " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

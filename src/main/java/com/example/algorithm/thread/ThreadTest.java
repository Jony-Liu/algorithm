package com.example.algorithm.thread;

public class ThreadTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread m1 = new MyThread("thread");
        MyThread m2 = new MyThread("thread2");
        m1.start();
        m2.start();
    }
}

package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/5 16:24
 */
public class ServiceTest {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}

package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/26 8:59
 */
public class GetIdTest {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("thread.getId() = "+thread.getId());
    }
}

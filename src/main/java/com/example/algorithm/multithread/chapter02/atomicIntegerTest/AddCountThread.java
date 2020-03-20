package com.example.algorithm.multithread.chapter02.atomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Jony-Liu
 * @date 2020/3/19 22:29
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}

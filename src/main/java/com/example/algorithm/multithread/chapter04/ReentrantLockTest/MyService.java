package com.example.algorithm.multithread.chapter04.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jony-Liu
 * @date 2020/3/29 21:58
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5 ; i++) {
            System.out.println("ThreadName= "+Thread.currentThread().getName()+(" "+(i+1)));
        }
        lock.unlock();
    }
}

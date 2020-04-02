package com.example.algorithm.multithread.chapter04.useConditionWaitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:13
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}

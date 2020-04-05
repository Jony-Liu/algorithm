package com.example.algorithm.multithread.chapter04.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jony-Liu
 * @date 2020/3/29 23:52
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue == true) {
                condition.await();
            }
            System.out.println("打印了*");
            hasValue = true;
            condition.signal();
            /**
             * 多对多交替打印时，请使用
             * condition.signalAll();
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void get() {
        try {
            lock.lock();
            while (hasValue == false) {
                condition.await();
            }
            System.out.println("打印了#");
            hasValue = false;
            condition.signal();
            /**
             * 多对多交替打印时，请使用
             * condition.signalAll();
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

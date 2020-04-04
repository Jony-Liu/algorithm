package com.example.algorithm.multithread.chapter04.ReentrantReadLockBegin1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Jony-Liu
 * @date 2020/4/4 11:05
 */
public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("获得read锁" + Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("获得write锁" + Thread.currentThread().getName() + System.currentTimeMillis());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }
    }

}

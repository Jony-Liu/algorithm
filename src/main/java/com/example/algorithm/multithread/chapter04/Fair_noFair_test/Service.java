package com.example.algorithm.multithread.chapter04.Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jony-Liu
 * @date 2020/4/2 22:51
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try {
            lock.lock();
            System.out.println("ThreadName="+Thread.currentThread().getName()
            +"获得了锁");
        }finally {
            lock.unlock();
        }
    }
}

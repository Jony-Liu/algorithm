package com.example.algorithm.multithread.chapter04.MustUseMoreCondition_OK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Jony-Liu
 * @date 2020/3/29 23:06
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition conditionA = lock.newCondition();
    public Condition conditionB = lock.newCondition();
    public void awaitA(){
        lock.lock();
        System.out.println("begin awaitA time = "+ System.currentTimeMillis() +" thread name = "+Thread.currentThread().getName());
        try {
            conditionA.await();
            System.out.println("end awaitA time = "+ System.currentTimeMillis() +" thread name = "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void awaitB(){
        lock.lock();
        System.out.println("begin awaitB time = "+ System.currentTimeMillis() +" thread name = "+Thread.currentThread().getName());
        try {
            conditionB.await();
            System.out.println("end awaitB time = "+ System.currentTimeMillis() +" thread name = "+Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void signalAll_A(){
        lock.lock();
        System.out.println("signalAll_A time " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        conditionA.signalAll();
        lock.unlock();
    }

    public void signalAll_B(){
        lock.lock();
        System.out.println("signalAll_B time " + System.currentTimeMillis() + " thread name = " + Thread.currentThread().getName());
        conditionB.signalAll();
        lock.unlock();
    }

}

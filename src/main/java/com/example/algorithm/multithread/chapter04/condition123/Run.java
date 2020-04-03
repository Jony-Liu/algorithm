package com.example.algorithm.multithread.chapter04.condition123;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用Condition实现顺序执行
 * @author Jony-Liu
 * @date 2020/4/3 0:19
 */
public class Run {
    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args) {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName()+" ThreadA " + (i + 1));
                }
                nextPrintWho = 2;
                conditionB.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadB = new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 2) {
                        conditionB.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println(Thread.currentThread().getName()+" ThreadB " + (i + 1));
                    }
                    nextPrintWho = 3;
                    conditionC.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadC = new Thread(){
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 3) {
                        conditionC.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println(Thread.currentThread().getName()+ " ThreadC " + (i + 1));
                    }
                    nextPrintWho = 1;
                    conditionA.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };
        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            aArray[i].setName("threadA-"+i);
            bArray[i] = new Thread(threadB);
            bArray[i].setName("threadB-"+i);
            cArray[i] = new Thread(threadC);
            cArray[i].setName("threadC-"+i);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}

package com.example.algorithm.multithread.chapter03.waitInterruptException;

/**
 * @author Jony-Liu
 * @date 2020/3/26 21:28
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin lock");
                lock.wait();
                System.out.println("end lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("出现了异常，因为被interrupt了");
        }
    }
}

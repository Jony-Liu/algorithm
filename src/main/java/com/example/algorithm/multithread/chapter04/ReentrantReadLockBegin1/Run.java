package com.example.algorithm.multithread.chapter04.ReentrantReadLockBegin1;

/**
 * @author Jony-Liu
 * @date 2020/4/4 11:10
 */
public class Run {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }

}

package com.example.algorithm.multithread.chapter02.synBlockString2;

/**
 * @author Jony-Liu
 * @date 2020/1/20 17:57
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("C");
        threadA.start();
        ThreadB b = new ThreadB(service);
        b.setName("D");
        b.start();
    }
}

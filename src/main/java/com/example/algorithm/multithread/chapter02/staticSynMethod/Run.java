package com.example.algorithm.multithread.chapter02.staticSynMethod;

/**
 * @author Jony-Liu
 * @date: 2020/2/17 10:12
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA a = new ThreadA(service1);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service2);
        b.setName("B");
        b.start();
    }
}

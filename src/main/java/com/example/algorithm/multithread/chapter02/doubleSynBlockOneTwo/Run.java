package com.example.algorithm.multithread.chapter02.doubleSynBlockOneTwo;

/**
 * @author Jony-Liu
 * @date 2020/1/20 15:29
 */
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        ThreadA a = new ThreadA(objectService);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(objectService);
        b.setName("b");
        b.start();
    }
}

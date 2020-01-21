package com.example.algorithm.multithread.chapter02.synBlockString;

/**
 * @author jonyliu
 * @date 2020/1/20 17:41
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}

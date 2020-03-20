package com.example.algorithm.multithread.chapter02.synchronizedUpdateNewValue;

/**
 * @author Jony-Liu
 * @date 2020/3/19 23:07
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            ThreadA threadA = new ThreadA(service);
            threadA.start();
            Thread.sleep(1000);
            ThreadB threadB = new ThreadB(service);
            threadB.start();
            System.out.println("已经发起停止的命令了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

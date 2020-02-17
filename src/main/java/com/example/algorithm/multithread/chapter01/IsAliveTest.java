package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/24 9:09
 */
public class IsAliveTest {
    public static void main(String[] args) {
        IsAliveDemo isAliveDemo = new IsAliveDemo();
        Thread thread = new Thread(isAliveDemo);
        thread.setName("A");
        System.out.println("isAliveDemo isAlive== "+thread.isAlive());
        thread.start();
        System.out.println("isAliveDemo isAlive== "+thread.isAlive());
    }
}

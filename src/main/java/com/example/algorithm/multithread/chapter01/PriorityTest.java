package com.example.algorithm.multithread.chapter01;

public class PriorityTest {
    public static void main(String[] args) {
        System.out.println("PriorityTest's Priority :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("PriorityTest's Priority :"+Thread.currentThread().getPriority());
        PriorityDemo thread = new PriorityDemo();
        thread.start();
    }
}

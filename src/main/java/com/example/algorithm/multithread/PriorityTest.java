package com.example.algorithm.multithread;

public class PriorityTest {
    public static void main(String[] args) {
        System.out.println("PriorityTest's Priority :"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        PriorityDemo thread = new PriorityDemo();
        thread.start();
    }
}

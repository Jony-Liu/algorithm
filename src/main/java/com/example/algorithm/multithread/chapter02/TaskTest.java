package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/13 21:26
 */
public class TaskTest {
    public static void main(String[] args) {
        Task task = new Task();
        TaskMethod1 taskMethod1 = new TaskMethod1(task);
        TaskMethod2 taskMethod2 = new TaskMethod2(task);
        taskMethod1.start();
        taskMethod2.start();
    }
}

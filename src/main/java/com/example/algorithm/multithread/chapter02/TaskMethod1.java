package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date: 2020/1/13 21:22
 */
public class TaskMethod1 extends Thread {

    private Task task;

    public TaskMethod1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}

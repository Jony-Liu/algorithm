package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date: 2020/1/13 21:24
 */
public class TaskMethod2 extends Thread {

    private Task task;

    public TaskMethod2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTask();
    }
}

package com.example.algorithm.multithread.chapter02.t8;

/**
 * @author jonyliu
 * @date 2020/1/20 15:45
 */
public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}

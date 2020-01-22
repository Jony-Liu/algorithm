package com.example.algorithm.multithread.chapter02.t8;

/**
 * @author jonyliu
 * @date 2020/1/20 15:46
 */
public class MyThread2  extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}

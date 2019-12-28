package com.example.algorithm.multithread;

/**
 * @author Jony-Liu
 * @date 2019/12/28 22:17
 */
public class SuspendResumeDemo extends Thread{

    private long i =0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
        }
    }
}

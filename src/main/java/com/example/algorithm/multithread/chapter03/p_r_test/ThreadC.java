package com.example.algorithm.multithread.chapter03.p_r_test;

/**
 * @author Jony-Liu
 * @date 2020/3/28 22:50
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c){
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.getValue();
        }
    }
}

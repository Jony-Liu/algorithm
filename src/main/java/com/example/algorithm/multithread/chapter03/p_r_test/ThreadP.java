package com.example.algorithm.multithread.chapter03.p_r_test;

/**
 * @author Jony-Liu
 * @date 2020/3/28 22:49
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}

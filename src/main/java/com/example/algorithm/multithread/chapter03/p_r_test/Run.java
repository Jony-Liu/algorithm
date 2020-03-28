package com.example.algorithm.multithread.chapter03.p_r_test;

/**
 * @author Jony-Liu
 * @date 2020/3/28 22:52
 */
public class Run {

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP p1 = new ThreadP(p);
        ThreadC c1 = new ThreadC(c);
        p1.start();
        c1.start();
    }

}

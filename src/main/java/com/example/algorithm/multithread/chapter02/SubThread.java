package com.example.algorithm.multithread.chapter02;

public class SubThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}

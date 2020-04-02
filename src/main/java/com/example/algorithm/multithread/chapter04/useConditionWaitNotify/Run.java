package com.example.algorithm.multithread.chapter04.useConditionWaitNotify;

/**
 * @author Jony-Liu
 * @date 2020/3/29 22:17
 */
public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        myThreadA.start();
    }

}

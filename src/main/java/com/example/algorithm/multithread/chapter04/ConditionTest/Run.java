package com.example.algorithm.multithread.chapter04.ConditionTest;

/**
 * @author Jony-Liu
 * @date 2020/3/30 0:01
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA myThreadA = new MyThreadA(myService);
        MyThreadB myThreadB = new MyThreadB(myService);
        myThreadA.start();
        myThreadB.start();
    }
}

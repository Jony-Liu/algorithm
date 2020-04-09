package com.example.algorithm.multithread.chapter01;

/**
 * @author Jony-Liu
 * @date 2019/12/30 9:35
 */
public class SuspendResumeDemo02 {
     synchronized public void printString(){
        System.out.println(Thread.currentThread().getName()+"begin");
        if("a".equals(Thread.currentThread().getName())){
            System.out.println("a线程永远suspend");
            Thread.currentThread().suspend();
        }
        System.out.println(Thread.currentThread().getName()+"end");
    }
}

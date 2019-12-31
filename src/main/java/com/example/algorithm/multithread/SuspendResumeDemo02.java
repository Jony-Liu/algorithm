package com.example.algorithm.multithread;

/**
 * @author jonyliu
 * @date 2019/12/30 9:35
 */
public class SuspendResumeDemo02 {
    synchronized public void printString(){
        System.out.println("begin");
        if("a".equals(Thread.currentThread().getName())){
            System.out.println("a线程永远suspend");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}

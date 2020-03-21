package com.example.algorithm.multithread.chapter02;

/**
 * @author Jony-Liu
 * @date 2020/1/13 21:16
 */
public class Task {
    public void doLongTimeTask(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("no synchronized threadName="+Thread.currentThread().getName()+" i = "+i);
        }
        synchronized (this){
            for (int i = 0; i <100 ; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i = "+i);
            }
        }
    }
}
